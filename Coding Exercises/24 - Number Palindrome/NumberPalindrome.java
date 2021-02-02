public class NumberPalindrome {
     public static boolean isPalindrome(int number){

        int numberBackwards = 0;
        int numberForwards = number;

        if ((number >= 0) && (number < 10)) {
            return false;
        }

        do {
            numberBackwards += (number % 10);
            numberBackwards *= 10;
            number /= 10;
        }
        while (number != 0);

        numberBackwards /= 10;
        return (numberForwards == numberBackwards);
    }
}