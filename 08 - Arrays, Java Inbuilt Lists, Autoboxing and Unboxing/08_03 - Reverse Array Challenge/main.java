import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        int[] integers = new int[] {1, 5, 3, 7, 11, 9, 15};
        System.out.println("The array has the values : " + Arrays.toString(integers));
        reverse(integers);
        System.out.println("The array reversed : " + Arrays.toString(integers));
    }

    private static void reverse(int[] array)
    {
        int maxIndex = array.length - 1;
        int halfWay = array.length / 2;
        for (int i = 0; i < halfWay; i++)
        {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}