import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] values = readIntegers(count);

        System.out.println("values array contains : " + Arrays.toString(values));
        System.out.println("The minimum value in the array is : " + findMin(values));
    }

    private static int[] readIntegers(int count)
    {
        int[] integers = new int[count];
        System.out.println("Type " + count + " numbers in to the console:\r");
        for (int x = 0; x < integers.length; x++)
        {
            integers[x] = scanner.nextInt();
            scanner.nextLine();
        }
        return integers;
    }

    private static int findMin(int[] array)
    {
        int minValue = Integer.MAX_VALUE;
        for (int x = 0; x < array.length; x++)
        {
            if (array[x] < minValue)
            {
                minValue = array[x];
            }
        }
        return minValue;
    }

}