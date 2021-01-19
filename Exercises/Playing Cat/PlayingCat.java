public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){

        if (temperature >= 25) {
            if ((summer) && (temperature <= 45)){
                return true;
            } else if ((!summer) && (temperature <= 35)){
                return true;
            }
        }

        return false;
    }
}