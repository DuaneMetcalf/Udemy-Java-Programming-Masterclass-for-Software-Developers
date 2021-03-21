import uk.duanemetcalf.mylibrary.Sequences.Series;

public class Main {

    public static void main(String[] args) {
    
        System.out.println("\nnSum()");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.nSum(i));
        }
    
        System.out.println("\nfactorial()");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.factorial(i));
        }
    
        System.out.println("\nfibonacci()");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}