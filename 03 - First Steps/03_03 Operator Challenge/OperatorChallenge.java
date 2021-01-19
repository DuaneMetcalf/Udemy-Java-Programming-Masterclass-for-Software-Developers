/*
* 1. Create a double variable with a value of 20.00
* 2. Create a second variable of type double with a value of 80.00
* 3. Add both numbers together and multiply by 100.00
* 4. Use the remainder operator to figure out what the remainder from the operation in step 3 and 40.00
* 5. Create a boolean value that assigns true if the remainder of step 4 is 0, or false if it is not 0
* 6. Output the boolean variable.
* 7. Write an if-then statement that displays a message "Got some remainder" if the boolean value in step 5 is not true
* */

public class Main {

    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double result = (firstDouble + secondDouble) * 100.00d;
        System.out.println("Result of firstDouble add secondDouble multiplied by 100 is: " + result);

        double theRemainder = result % 40.00d;
        System.out.println("The remainder of the result = " + theRemainder);

        boolean isZero = (theRemainder == 0) ? true : false;
        System.out.println("The boolean value is: " + isZero);

        if(!isZero)
        {
            System.out.println("Got some remainder");
        }
    }
}