package challenge;

import java.util.Scanner;

public class PlayerScore {
    public static void main(String[] args) {
        int score, position;
        String str1;
        int count = 0;
        int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of scores for which you wish to calculate the value");
        count = s.nextInt();
        while (i < count) {
            System.out.println("Enter the score of the  player:");
            score = s.nextInt();
            position = calculatePlayerPosition(score);
            System.out.println("Enter the name of the player :");
            str1 = s.next();
            playerDetails(position, str1);
            i++;
        }
    }
    public static int calculatePlayerPosition(int score)
    {
       if(score>=1000)
       {
           return 1;
       }
       else if(score>=500&&score<=1000)
       {
           return 2;
       }
       else if(score>=100&&score<=500)
       {
           return  3;
       }
       else
       {
           return 4;
       }
    }
    public static void playerDetails(int position,String str1)
    {
        System.out.println("The player "+ str1+" managed to get the position "+position+" on the high score table :");
    }
    }

