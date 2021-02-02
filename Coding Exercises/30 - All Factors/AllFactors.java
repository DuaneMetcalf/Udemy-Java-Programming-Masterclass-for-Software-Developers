public class FactorPrinter {
    public static void printFactors(int number){

        String factors = "";

        if (number < 1){
            factors = "Invalid Value";
        }

        for (int x = 1; x <= number; x++){
            if (number % x == 0){
                factors += " " + x;
            }
        }

        System.out.println(factors);
    }
}