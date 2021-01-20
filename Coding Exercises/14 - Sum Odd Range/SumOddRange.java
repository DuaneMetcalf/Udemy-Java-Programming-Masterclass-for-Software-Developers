public class SumOddRange {
   public static boolean isOdd(int number){

        if (number < 1){
            return false;
        }

        if (number % 2 == 0){
            return false;
        }
        System.out.println(number);
        return true;
    }

    public static int sumOdd(int start, int end){

        int oddSum = 0;

        if ((start < 1) || (end < 1)){
            return -1;
        }
        if (end < start){
            return -1;
        }

        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                oddSum+= i;
            }
        }

        return oddSum;
    }
 
}