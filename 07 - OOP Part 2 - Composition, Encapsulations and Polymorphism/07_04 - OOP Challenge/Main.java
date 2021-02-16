public class Main {

    public static void main(String[] args) {
       Hamburger standard = new Hamburger("soft white", "sausage", 3.00);
        System.out.println(standard.getBurgerName() + ": \n"
                + standard.getMeat() + " on a " + standard.getBreadRoll() + " roll \n"
                + "base price = £" + standard.getBasePrice());
        standard.addItem("drink");
        standard.addItem("chips");
        standard.addItem("cheese");
        standard.addItem("tomato");
        standard.addItem("sauce");
        System.out.println(standard.getBurgerName() + " total price = £" +
                           String.format("%.2f",standard.getTotalPrice()) + "\n");

        standard.getOrderDetails();

        HealthyBurger healthyBurger = new HealthyBurger(3.00);
        System.out.println(healthyBurger.getBurgerName() + ": \n"
                + healthyBurger.getMeat() + " on a " + healthyBurger.getBreadRoll() + " roll \n"
                + "base price = £" + healthyBurger.getBasePrice());
        healthyBurger.addItem("lettuce");
        healthyBurger.addItem("pickle");
        healthyBurger.addItem("cheese");
        healthyBurger.addItem("tomato");
        healthyBurger.addItem("sauce");
        healthyBurger.addItem("onion");
        healthyBurger.addItem("chips");
        System.out.println(healthyBurger.getBurgerName() + " total price = £" +
                           String.format("%.2f",healthyBurger.getTotalPrice()) + "\n");

        healthyBurger.getOrderDetails();

        DeluxeBurger deluxeBurger = new DeluxeBurger(3.00);
        System.out.println(deluxeBurger.getBurgerName() + ": \n"
                + deluxeBurger.getMeat() + " on a " + deluxeBurger.getBreadRoll() + " roll");
        deluxeBurger.addItem("cheese");
        System.out.println(deluxeBurger.getBurgerName() + " total price = £" +
                           String.format("%.2f",deluxeBurger.getTotalPrice()) + "\n");

        deluxeBurger.getOrderDetails();
    }
}