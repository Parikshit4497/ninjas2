package Online.Variabeles.ExpressionStatementsCodeBlocks;

public class MethodOverloading {
    public static void main(String[] args) {
        int newscore=calculateScore("Tim",500);
        System.out.println("New Score is " +newscore);
        calculateScore(75);
        calculateScore();

    }
    public static  int calculateScore(String playerName,int score){
        System.out.println("Player " + playerName +" scored " +score +" points ");
        return score*1000;
    }
    public static  int calculateScore(int score)
    {
        System.out.println("Unnamed player  scored " +score+ " points");
        return score*1000;
    }
    public static  int calculateScore()
    {
        System.out.println("No player name no player score ");
        return 0;
    }
}
