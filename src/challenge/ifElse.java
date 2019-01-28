package challenge;

public class ifElse {
    public static void main(String[] args) {
        boolean gameover =true;
        int score=800;
        int levelCompleted=5;
        int bonus =100;
        if(score<5000&&score>1000)
        {
            System.out.println("Your score is greater than 1000 but less than 5000:");
        }
        else if(score<1000)
        {
            System.out.println("Your score is less than 1000:");
        }
        else
        {
            System.out.println("got here");
        }
        if(gameover)
        {
             int finalscore=score +(levelCompleted*bonus);
            System.out.println("Your final score:" + finalscore);
        }
        score=10000;
        levelCompleted=8;
        bonus=200;
        if(gameover)
        {
            int finalscore=score +(levelCompleted*bonus);
            System.out.println("Your final score:" + finalscore);
        }
    }
}
