public class LargestPrime {
     public static int getLargestPrime(int number){

        int maxPrime = 2;

        if (number < 2){
            maxPrime = -1;
        }

        for (int i = 3; i <= number; i++){
            if (number % i == 0){
                maxPrime = i;
            }

        }

        for (int x = maxPrime; x > 1; x--){
            if(maxPrime % x == 0){
                maxPrime = x;
            }
        }

        return maxPrime;
    }
}