public class TeenNumberChecker {

    public static boolean hasTeen (int valueOne, int valueTwo, int valueThree) {

        if (((valueOne >= 13) && (valueOne <= 19)) ||
                ((valueTwo >= 13) && (valueTwo <= 19))||
                ((valueThree >= 13) && (valueThree <= 19))) {
            return true;
        }

        return false;
    }

    public static boolean isTeen (int number){
        if ((number > 12) && (number < 20)) {
            return true;
        }
        return false;
    }
}