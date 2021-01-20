public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        
        boolean areEqual = false;

        int numberOne = (int) (firstNumber * 1000);
        int numberTwo = (int) (secondNumber * 1000);

        if (numberOne == numberTwo) 
		{
            areEqual = true;
        }

        return areEqual;
    }
 
}
