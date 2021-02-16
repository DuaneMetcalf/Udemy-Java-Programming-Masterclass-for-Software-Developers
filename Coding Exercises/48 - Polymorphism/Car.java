public class Car{

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){

        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }
   
    public String startEngine(){
        return this.name + " -> startEngine()";
    }

    public String accelerate(){
        return this.name + " -> accelerate()";
    }

    public String brake(){
        return this.name + " -> brake()";
    }

    public String getName(){
        return name;
    }

    public int getCylinders(){
        return cylinders;
    }

}