public class PerfectNumber {
   public static boolean isPerfectNumber(int number){

        int sumFactors = 0;
        if (number < 1) {
            return false;
        }

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sumFactors += i;
            }
        }

        return (sumFactors == number);
    }
}