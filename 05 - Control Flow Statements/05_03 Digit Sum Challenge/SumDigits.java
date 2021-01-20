public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Sum of digits in 125 is " + sumDigits(125));
        System.out.println("Sum of digits in -125 is " + sumDigits(-125));
        System.out.println("Sum of digits in 5 is " + sumDigits(5));
        System.out.println("Sum of digits in 32123 is " + sumDigits(32123));

        System.out.println("--------------");
    }

    public static int sumDigits(int number)
    {

        int sum = -1;

        if (number >= 10)
        {
            while (number > 0)
            {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            // compensate for the initial -1 value assigned to sum for validation
            sum++;
        }

        return sum;
    }

}