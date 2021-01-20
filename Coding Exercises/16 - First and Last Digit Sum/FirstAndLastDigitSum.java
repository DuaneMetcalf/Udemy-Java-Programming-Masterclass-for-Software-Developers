public class FirstLastDigitSum {
        public static int sumFirstAndLastDigit(int number){
        int sum = -1;
        int lastDigit = 0;

        if (number >= 0){
            // compensate for the initial -1 value assigned to sum for validation
            sum++;
            lastDigit = number % 10;
            while (number >= 10){
                number /= 10;
            }
            sum =+ lastDigit;
            sum += number;
            
        }

        return sum;
    }
}