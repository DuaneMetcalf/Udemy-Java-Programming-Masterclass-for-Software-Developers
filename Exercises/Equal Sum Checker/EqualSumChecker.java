public class EqualSumChecker {

    public static boolean hasEqualSum(int numberOne, int numberTwo, int result) {

        if ((numberOne + numberTwo) == result) {
            return true;
        }

        return false;
    }
}