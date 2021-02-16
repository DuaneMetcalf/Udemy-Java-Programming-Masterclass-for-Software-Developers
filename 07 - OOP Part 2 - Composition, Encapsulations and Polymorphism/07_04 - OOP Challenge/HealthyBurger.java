public class HealthyBurger extends Hamburger {

    private String burgerName;
    private int extraItems;
    private double total;
    private Additions addition5;
    private Additions addition6;


    public HealthyBurger(double basePrice) {
        super("brown rye", "veggie", basePrice);
        this.burgerName = "Bill's Healthy Burger";
        this.extraItems = 0;
        this.total = 0;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public double getTotalPrice() {
        return this.total + super.getTotalPrice();
    }

    @Override
    public void getOrderDetails(){
        System.out.println("--*-- Order Details --*--");
        System.out.println(getBurgerName() + ": " + getBasePrice());
        super.getAdditions();

        if(addition5 != null){
            System.out.println(addition5.getAdditionName() + ": " + addition5.getAdditionPrice());
        }

        if(addition6 != null){
            System.out.println(addition6.getAdditionName() + ": " + addition6.getAdditionPrice());
        }

        System.out.println("Total: " + String.format("%.2f", getTotalPrice()) + "\n");
    }

    @Override
    public void addItem(String itemName) {
        if (super.getNumberOfAdditions() < super.getMaxAdditions()) {
            super.addItem(itemName);
        } else if (this.extraItems < 2) {
            if (extraItems == 0) {
                addition5 = new Additions(itemName);
                System.out.println(addition5.getAdditionName() + " added at a cost of £" + addition5.getAdditionPrice());
                this.total += addition5.getAdditionPrice();
            } else if (extraItems == 1) {
                addition6 = new Additions(itemName);
                System.out.println(addition6.getAdditionName() + " added at a cost of £" + addition6.getAdditionPrice());
                this.total += addition6.getAdditionPrice();
            }
            this.extraItems++;
        } else {
            System.out.println("No more items can be added");
        }
    }

}