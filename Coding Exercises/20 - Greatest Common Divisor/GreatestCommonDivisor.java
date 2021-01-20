public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){

        int commonDivisor = -1;

        if ((first < 10) || (second < 10)) {
            return commonDivisor;
        }

        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }
}