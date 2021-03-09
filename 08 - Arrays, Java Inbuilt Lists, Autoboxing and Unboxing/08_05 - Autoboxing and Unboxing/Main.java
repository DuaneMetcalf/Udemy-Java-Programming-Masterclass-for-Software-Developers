package drm.duanemetcalf;

import java.util.Scanner;

public class Main
{

    private static Bank bank;
    private static Scanner scanner = new Scanner(System.in);
    private static boolean showingMainMenu = true;

    public static void main(String[] args)
    {

        System.out.println("Enter Bank Name: ");
        String bankName = scanner.nextLine();
        bank = new Bank(bankName);

        boolean quit = false;
        int menuSelection = 0;
        showMenu();

        while (!quit)
        {
            System.out.println("Enter your choice: ");
            menuSelection = scanner.nextInt();
            scanner.nextLine();
            if (showingMainMenu)
            {
                switch (menuSelection)
                {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        showBranches();
                        break;
                    case 2:
                        selectBranch();
                        break;
                    case 3:
                        addBranch();
                        break;
                    case 4:
                        editBranch();
                        break;
                    case 5:
                        removeBranch();
                        break;
                    case 6:
                        searchBranch();
                        break;
                    case 7:
                        showMenu();
                        break;
                }
            }
            else
            {
                switch (menuSelection)
                {
                    case 0:
                        showingMainMenu = true;
                        showMenu();
                        break;
                    case 1:
                        addCustomer();
                        break;
                    case 2:
                        addCustomerTransaction();
                        break;
                    case 3:
                        editCustomer();
                        break;
                    case 4:
                        removeCustomer();
                        break;
                    case 5:
                        searchCustomer();
                        break;
                    case 6:
                        showMenu();
                        break;
                }
            }
        }
    }

    public static void showTransactions()
    {
        System.out.println("Enter name of customer: ");
        String name = scanner.nextLine();
    }

    public static void addCustomer()
    {
        System.out.println("Enter name of new customer: ");
        String name = scanner.nextLine();
        System.out.println("Enter opening transaction: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        bank.addCustomer(name, amount);
    }

    public static void addCustomerTransaction()
    {
        System.out.println("Enter name of new customer: ");
        String name = scanner.nextLine();
        System.out.println("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        bank.addCustomerTransaction(name, amount);
    }

    public static void editCustomer()
    {
        System.out.println("Enter name of customer: ");
        String name = scanner.nextLine();
    }

    public static void removeCustomer()
    {
        System.out.println("Enter name of customer: ");
        String name = scanner.nextLine();
    }

    public static void searchCustomer()
    {
        System.out.println("Enter name of customer: ");
        String name = scanner.nextLine();
    }

    public static void showBranches()
    {
        bank.listBranches();
    }

    public static void selectBranch()
    {
        System.out.println("Enter branch name: ");
        String name = scanner.nextLine();
        bank.selectBranch(name);
        if (bank.selectBranch(name) != null)
        {
            showingMainMenu = false;
            showMenu();
        }
    }

    public static void addBranch()
    {
        System.out.println("Enter new branch name: ");
        String name = scanner.nextLine();
        bank.addBranch(name);
    }

    public static void editBranch()
    {
        System.out.println("Enter branch name: ");
        String oldName = scanner.nextLine();
        System.out.println("Enter new branch name");
        String newName = scanner.nextLine();
        bank.editBranch(oldName, newName);
    }

    public static void removeBranch()
    {
        System.out.println("Enter branch name: ");
        String name = scanner.nextLine();
        bank.deleteBranch(name);
    }

    public static void searchBranch()
    {
        System.out.println("Enter branch name: ");
        String name = scanner.nextLine();
        bank.queryBranch(name);
    }

    public static void showMenu()
    {
        if (showingMainMenu)
        {
            mainMenu();
        }
        else
        {
            subMenu();
        }
    }

    private static void mainMenu()
    {
        System.out.println("\n Choose from the following options ");
        System.out.println("\t 0 - To quit");
        System.out.println("\t 1 - List all branches and customers");
        System.out.println("\t 2 - select a branch");
        System.out.println("\t 3 - To add a new branch");
        System.out.println("\t 4 - To edit a branch");
        System.out.println("\t 5 - To remove a branch");
        System.out.println("\t 6 - To search for branch");
        System.out.println("\t 7 - To display choice options");
    }

    private static void subMenu()
    {
        System.out.println("\n Choose from the following options ");
        System.out.println("\t 0 - To go back to main menu");
        System.out.println("\t 1 - To add a new customer");
        System.out.println("\t 2 - To add a new transaction");
        System.out.println("\t 3 - To edit a customer");
        System.out.println("\t 4 - To remove a customer");
        System.out.println("\t 5 - To search for a customer");
        System.out.println("\t 6 - To display choice options");
    }

}
