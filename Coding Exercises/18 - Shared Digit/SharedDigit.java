public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if ((firstNumber < 10) || (firstNumber > 99) || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        }

        if ((firstNumber % 10) != (secondNumber % 10)) {
            if ((firstNumber % 10) != (secondNumber / 10)) {
                if((firstNumber / 10) != (secondNumber % 10)){
                    if((firstNumber / 10) != (secondNumber / 10)){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}