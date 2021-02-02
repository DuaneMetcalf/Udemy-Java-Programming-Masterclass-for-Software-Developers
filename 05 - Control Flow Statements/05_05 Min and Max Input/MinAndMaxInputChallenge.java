import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (true)
        {

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt)
            {
                int number = scanner.nextInt();
                if (number < min)
                {
                    min = number;
                }
                if (number > max)
                {
                    max = number;
                }
            }
            else
            {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("The minimum number entered is " + min);
        System.out.println("The maximum number entered is " + max);
        scanner.close();
    }

}