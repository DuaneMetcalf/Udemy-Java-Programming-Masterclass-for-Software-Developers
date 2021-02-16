public class Additions {

    private String additionName;
    private double additionPrice;

    public Additions(String additionName) {
        this.additionName = additionName;
        switch (additionName.toLowerCase()) {
            case "chips":
                this.additionPrice = 1.00;
                break;
            case "drink":
                this.additionPrice = 1.25;
                break;
            case "lettuce":
                this.additionPrice = 0.25;
                break;
            case "sauce":
                this.additionPrice = 0.10;
                break;
            case "cheese":
                this.additionPrice = 0.55;
                break;
            case "tomato":
                this.additionPrice = 0.45;
                break;
            case "onion":
                this.additionPrice = 0.30;
                break;
            case "pickle":
                this.additionPrice = 0.15;
                break;
            default:
                this.additionPrice = 1.05;
        }
    }

    public String getAdditionName() {
        return this.additionName;
    }

    public double getAdditionPrice() {
        return this.additionPrice;
    }

}