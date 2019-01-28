package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class StairCaseProb {
    public int CountStairs(int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        if(n==3)
        {
            return 3;
        }
        return CountStairs(n-1)+CountStairs(n-2)+CountStairs(n-3);
    }
}
class stairUse
{
    public static void main(String[] args) {
        StairCaseProb s1=new StairCaseProb();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of stairs ");
        int n=s.nextInt();
        System.out.println("The number of ways that the person can climb the stairs: " + s1.CountStairs(n));
    }
}
