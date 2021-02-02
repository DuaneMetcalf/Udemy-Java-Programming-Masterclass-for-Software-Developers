import java.util.Scanner;
 
public class InputCalculator {
    
        public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0L;
        int numbersEntered = 0;

        while(true){
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();
                numbersEntered++;
                sum += number;
                avg = (long) Math.round((double) sum / numbersEntered);
            }else{
                break;
            }
        }

        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}