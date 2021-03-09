import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement
{

    private static Scanner scanner;

    private static int readInteger()
    {
        scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    private static int[] readElements(int value)
    {
        scanner = new Scanner(System.in);
        int[] integers = new int[value];
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