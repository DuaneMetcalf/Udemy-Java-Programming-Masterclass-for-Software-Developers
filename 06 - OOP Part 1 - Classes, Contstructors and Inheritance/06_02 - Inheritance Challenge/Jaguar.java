public class Jaguar extends Car{
    private String model;
    private String drive;

    public Jaguar(boolean isManual, int numberOfGears, int numberOfDoors, String model, String drive) {
        super("Jaguar", "Land", isManual, numberOfGears, 4, numberOfDoors);
        this.model = model;
        this.drive = drive;
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed <= 0){
            stop();
            changeGear('N');
        }else if(newSpeed > 0 && newSpeed <= 10){
            changeGear('1');
        }else if(newSpeed > 10 && newSpeed <= 20){
            changeGear('2');
        }else if(newSpeed > 20 && newSpeed <= 30){
            changeGear('3');
        }else{
            changeGear('4');
        }

        if (newSpeed > 0){
            changeSpeed(getSteeringAngle(), newSpeed);
        }
    }
}