public class Vehicle {

    private String name;
    private String type; // Land, Sea, Air
    private int steeringAngle;
    private int currentSpeed;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
        this.currentSpeed = 0;
        this.steeringAngle = 0;
    }

    public void steer(int direction) {
        steeringAngle += direction;
        System.out.println("Vehicle.steer() at " + steeringAngle + " degrees");
    }

    public void move(int direction, int speed) {
        steeringAngle = direction;
        currentSpeed = speed;
        System.out.println("Vehicle.move() at " + steeringAngle + " degrees and at " + currentSpeed + " mph");
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("Vehicle.stop()");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSteeringAngle() {
        return steeringAngle;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

}