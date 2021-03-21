import java.util.Scanner;

public class Main {
    private static MobilePhone mobilephone = new MobilePhone();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int selection = 0;
        displayOptions();

        while (!quit) {
            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 0:
                    displayOptions();
                    break;
                case 1:
                    listContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void listContacts(){
        System.out.println("Contact List:");
        mobilephone.displayContacts();
    }

    public static void findContact(){
        System.out.print("Enter contact name to search: ");
        String name = scanner.nextLine();
        mobilephone.searchContact(name);
    }

    public static void updateContact(){
        System.out.println("Enter name of contact to update: ");
        String oldContact = scanner.nextLine();
        System.out.println("Enter new name: ");
        String newContact = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = scanner.nextLine();
        mobilephone.modifyContact(oldContact, newContact, newNumber);
    }

    public static void removeContact(){
        System.out.print("Enter name of contact to delete: ");
        String name = scanner.nextLine();
        mobilephone.deleteContact(name);
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String number = scanner.nextLine();
        mobilephone.addContact(name, number);
    }

    public static void displayOptions(){
        System.out.print("\n 0: to display options");
        System.out.print("\n 1: To display the contact list");
        System.out.print("\n 2: To add a new contact");
        System.out.print("\n 3: To update an existing contact");
        System.out.print("\n 4: To remove a contact");
        System.out.print("\n 5: To search for a contact");
        System.out.print("\n 6: To quit");
        System.out.print("\n");
        System.out.print("\n Please make a selection: ");
    }
}

