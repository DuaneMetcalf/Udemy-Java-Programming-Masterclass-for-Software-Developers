public class Hamburger {

    private String burgerName;
    private String breadRoll;
    private String meat;
    private int maxAdditions;
    private double basePrice;
    private int numberOfAdditions;
    private double additionTotal;
    private Additions addition1;
    private Additions addition2;
    private Additions addition3;
    private Additions addition4;

    public Hamburger(String breadRoll, String meat, double basePrice) {
        this.burgerName = "Bill's Standard Burger";
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
        this.maxAdditions = 4;
        this.numberOfAdditions = 0;
        this.additionTotal = 0;
    }

    public void addItem(String itemName) {
        if (numberOfAdditions < maxAdditions) {
            if (this.numberOfAdditions == 0) {
                addition1 = new Additions(itemName);
                System.out.println(addition1.getAdditionName() + " added at a cost of £" + addition1.getAdditionPrice());
                this.additionTotal += addition1.getAdditionPrice();
            } else if (this.numberOfAdditions == 1) {
                addition2 = new Additions(itemName);
                System.out.println(addition2.getAdditionName() + " added at a cost of £" + addition2.getAdditionPrice());
                this.additionTotal += addition2.getAdditionPrice();
            } else if (this.numberOfAdditions == 2) {
                addition3 = new Additions(itemName);
                System.out.println(addition3.getAdditionName() + " added at a cost of £" + addition3.getAdditionPrice());
                this.additionTotal += addition3.getAdditionPrice();
            } else if (this.numberOfAdditions == 3) {
                addition4 = new Additions(itemName);
                System.out.println(addition4.getAdditionName() + " added at a cost of £" + addition4.getAdditionPrice());
                this.additionTotal += addition4.getAdditionPrice();
            }
            numberOfAdditions++;
        }else {
            System.out.println("No more items can be added");
        }
    }

    public String getBurgerName() {
        return burgerName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return additionTotal + basePrice;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public int getNumberOfAdditions(){
        return numberOfAdditions;
    }

    public int getMaxAdditions(){
        return maxAdditions;
    }

    public void getAdditions(){
        if(addition1 != null){
            System.out.println(addition1.getAdditionName() + ": " + addition1.getAdditionPrice());
        }

        if(addition2 != null){
            System.out.println(addition2.getAdditionName() + ": " + addition2.getAdditionPrice());
        }

        if(addition3 != null){
            System.out.println(addition3.getAdditionName() + ": " + addition3.getAdditionPrice());
        }

        if(addition4 != null){
            System.out.println(addition4.getAdditionName() + ": " + addition4.getAdditionPrice());
        }
    }

    public void getOrderDetails(){
        System.out.println("--*-- Order Details --*--");
        System.out.println(getBurgerName() + ": " + getBasePrice());
        getAdditions();
        System.out.println("Total: " + String.format("%.2f", getTotalPrice()) + "\n");
    }

}