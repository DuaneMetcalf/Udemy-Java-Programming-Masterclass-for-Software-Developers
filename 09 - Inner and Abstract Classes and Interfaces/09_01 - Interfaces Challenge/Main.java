import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Warlock duma = new Warlock("Duma", 3000, 2000, 1500, "Wand");
        System.out.println(duma.toString());
        saveCharacter(duma);

        duma.setHealth(3500);
        System.out.println(duma);
        duma.setWeapon("Staff");
        saveCharacter(duma);

//        loadCharacter(duma);
        System.out.println(duma);
    
        Murloc mrrgl = new Murloc("mrrgl", 3000, 2000);
        System.out.println(mrrgl.toString());
        saveCharacter(mrrgl);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveCharacter(ISaveable saveObject) {
        for (int i = 0; i < saveObject.saveValues().size(); i++) {
            System.out.println("Saving " + saveObject.saveValues().get(i) + " .....");
        }
    }

    public static void loadCharacter(ISaveable loadObject) {
        ArrayList<String> values = readValues();
        loadObject.loadValues(values);
    }

}