/*
Create a byte variable and set it to any valid byte number.
Create a short variable and set it to any valid short number.
Create and int variable and set it to any valid int number.
Create a variable of type long and make it equal to 50,000
plus 10 times the sum of the byte, plus the short, plus the int values.
*/

public class Main {

    public static void main(String[] args) {

        byte myByteVar = 10;
        short myShortVar = 20;
        int myIntVar = 50;
        long myLongTotal = 50000L + (10L * (myByteVar + myShortVar + myIntVar));

        System.out.println("The total = " + myLongTotal);
    }
}