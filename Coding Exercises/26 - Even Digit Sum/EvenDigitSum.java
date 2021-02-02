public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int sum = -1;

        if (number >= 0){
            int lastDigit;
            
            // compensate for the initial -1 value assigned to sum for validation
            sum++;
            
            while (number > 0){
                lastDigit = number % 10;
                if(lastDigit % 2 == 0){
                    sum += lastDigit;
                }
                number /= 10;
            }
        }

        return sum;
    }
}