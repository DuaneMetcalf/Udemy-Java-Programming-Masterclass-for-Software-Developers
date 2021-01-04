/*
* Create a variable with the appropriate type to store the number of pounds to be converted to kilograms
* Calculate the result based on the value of the variable above, and store the result in an appropriate variable
* Print out the result.
* 
* 1 pound = 0.45359237 kilograms
*
* */

public class Main {

    public static void main(String[] args) {

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;

        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
    }
}
