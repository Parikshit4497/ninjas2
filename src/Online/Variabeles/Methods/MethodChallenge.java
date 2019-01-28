package Online.Variabeles.Methods;

import java.util.Scanner;

public class MethodChallenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int playerScore;
        String playerName;
        System.out.println("Enter the name of the player:");
        playerName = s.nextLine();
        System.out.println("Enter the player score");
        playerScore = s.nextInt();
        displayHigherScorePosition(playerName, calculateHighScorePosition(playerScore));

    }

    public static void displayHigherScorePosition(String playerName, int playerPosition) {
        System.out.println("The player with the name " + playerName + " scored the position on " +playerPosition + " on the highscore table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position;
        if (playerScore >=1000) {
            position = 1;
        } else if (playerScore >=500) {
            position = 2;
        } else if (playerScore >=100 ) {
            position = 3;
        } else {
          position=5;
        }
return position;

    }
}