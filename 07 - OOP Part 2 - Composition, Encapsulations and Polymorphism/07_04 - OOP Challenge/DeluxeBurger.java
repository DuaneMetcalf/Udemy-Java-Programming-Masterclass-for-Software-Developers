public class DeluxeBurger extends Hamburger {

    private String burgerName;
    private int numberOfAdditions;
    private double additionTotal;
    private Additions deluxeExtra1 = new Additions("chips");
    private Additions deluxeExtra2 = new Additions("drink");

    public DeluxeBurger(double basePrice) {
        super("toasted soft brioche", "beef steak", basePrice);
        this.burgerName = "Bill's Deluxe Burger";
        this.numberOfAdditions = 4;
        this.additionTotal = 0;
        this.additionTotal = (this.deluxeExtra1.getAdditionPrice() + this.deluxeExtra2.getAdditionPrice());
    }

    public String getBurgerName() {
        return burgerName;
    }

    public double getTotalPrice() {
        return this.additionTotal + this.getBasePrice();
    }

    @Override
    public void addItem(String itemName) {
        System.out.println("Comes with " + deluxeExtra1.getAdditionName() + " and a " + deluxeExtra2.getAdditionName());
        System.out.println("No more items can be added");
    }

    @Override
    public void getOrderDetails(){
        System.out.println("--*-- Order Details --*--");
        System.out.println(getBurgerName() + ": " + getBasePrice());
        System.out.println(deluxeExtra1.getAdditionName() + ": " + deluxeExtra1.getAdditionPrice());
        System.out.println(deluxeExtra2.getAdditionName() + ": " + deluxeExtra2.getAdditionPrice());
        System.out.println("Total: " + String.format("%.2f", getTotalPrice()) + "\n");
    }

}