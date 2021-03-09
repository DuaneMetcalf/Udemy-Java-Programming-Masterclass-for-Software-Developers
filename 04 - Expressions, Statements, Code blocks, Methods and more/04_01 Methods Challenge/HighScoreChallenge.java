/*
 Create a method called displayHighScorePosition
 it should a players name as a parameter, and a 2nd parameter as a position in the high score table
 You should display the players name along with a message like " managed to get into position " and the
 position they got and a further message " on the high score table".

 Create a 2nd method called calculateHighScorePosition
 it should be sent one argument only, the player score
 it should return an in
 the return data should be
 1 if the score is >=1000
 2 if the score is >=500 and < 1000
 3 if the score is >=100 and < 500
 4 in all other cases
 call both methods and display the results of the following
 a score of 1500, 900, 400 and 50
*/

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Player 1", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Player 2", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Player 3", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Player 4", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " made it in to position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int finalPosition = 4;
        if (playerScore >= 1000) {
            finalPosition = 1;
        } else if (playerScore >= 500) {
            finalPosition = 2;
        } else if (playerScore >= 100) {
            finalPosition = 3;
        }
        return finalPosition;
    }

}
