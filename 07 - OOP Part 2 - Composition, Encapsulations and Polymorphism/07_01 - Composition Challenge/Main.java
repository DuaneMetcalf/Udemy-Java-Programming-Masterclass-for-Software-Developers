public class Main {

    public static void main(String[] args) {
	    Wall wall1 = new Wall("North");
	    Wall wall2 = new Wall("East");
	    Wall wall3 = new Wall("South");
	    Wall wall4 = new Wall("West");
	    Ceiling ceiling = new Ceiling(3, "White");
	    Bed bed = new Bed("King Size",4,1,1);
	    Lamp lamp = new Lamp("Purple", false, "SES");

	    Bedroom bedroom = new Bedroom("My Room", wall1,wall2,wall3,wall4,ceiling,bed,lamp);

	    bedroom.makeBed();
	    bedroom.getLamp().pressPowerSwitch();
		bedroom.getLamp().pressPowerSwitch();
    }
}