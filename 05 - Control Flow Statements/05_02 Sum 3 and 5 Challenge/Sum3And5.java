public class Main
{

    public static void main(String[] args)
    {

        int totalSum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                System.out.println(i + " can be divided by both 3 and 5");
                totalSum += i;
                count++;
            }
            if (count == 5)
            {
                break;
            }
        }
        System.out.println("The sum of all numbers found is " + totalSum);

    }

}