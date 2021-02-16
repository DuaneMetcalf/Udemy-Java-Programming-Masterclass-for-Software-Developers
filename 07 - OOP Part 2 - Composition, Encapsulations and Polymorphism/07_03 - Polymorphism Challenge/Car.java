class Car{
    private boolean hasEngine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.hasEngine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car.startEngine()";
    }

    public String accelerate(){
        return "Car.accelerate()";
    }

    public String brake(){
        return "Car.brake()";
    }
}

class Bentley extends Car{

    public Bentley(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Bentley.startEngine()";
    }

    @Override
    public String accelerate() {
        return "Bentley.accelerate()";
    }

    @Override
    public String brake() {
        return "Bentley.brake()";
    }
}

class Jaguar extends Car{

    public Jaguar(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Jaguar.startEngine()";
    }

    @Override
    public String accelerate() {
        return "Jaguar.accelerate()";
    }

    @Override
    public String brake() {
        return "Jaguar.brake()";
    }
}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi.startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi.accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi.brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	    Car car = new Car(8, "Generic Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Bentley bentley = new Bentley(12, "Bentley");
        System.out.println(bentley.startEngine());
        System.out.println(bentley.accelerate());
        System.out.println(bentley.brake());

        Jaguar jaguar = new Jaguar(8, "Jaguar");
        System.out.println(jaguar.startEngine());
        System.out.println(jaguar.accelerate());
        System.out.println(jaguar.brake());

        Mitsubishi mitsubishi = new Mitsubishi(8, "mitsubishi");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
    }
}
