public class IntEqualityPrinter {
    public static void printEqual(int valueOne, int valueTwo, int valueThree){

        if ((valueOne < 0) || (valueTwo < 0) || (valueThree < 0)) 
		{
            System.out.println("Invalid Value");
        }
        else if ((valueOne == valueTwo) && (valueTwo == valueThree))
		{
            System.out.println("All numbers are equal");
        }
        else if ((valueOne != valueTwo) && (valueOne != valueThree) && (valueTwo != valueThree))
		{
            System.out.println("All numbers are different");
        } 
		else 
		{
            System.out.println("Neither all are equal or different");
        }
    }
}