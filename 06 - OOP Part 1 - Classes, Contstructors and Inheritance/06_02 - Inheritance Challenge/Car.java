public class Car extends Vehicle {
    private boolean isManual;
    private int numberOfGears;
    private char currentGear;
    private int numberOfWheels;
    private int numberOfDoors;

    public Car(String name, String type, boolean isManual, int numberOfGears, int numberOfWheels, int numberOfDoors) {
        super(name, type);
        this.isManual = isManual;
        this.numberOfGears = numberOfGears;
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.currentGear = 'N';
    }

    public void changeGear(char newGear) {
        this.currentGear = newGear;
        System.out.println("Car.changeGear() changed to " + this.currentGear);
    }

    public void changeSpeed(int direction, int speed){
        System.out.println("Car.changeSpeed() at " + direction + " degrees and at " + speed + " mph");
        move(direction, speed);
    }

}