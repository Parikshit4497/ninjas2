package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on १०-०८-२०१७.
 */
public class CountZeroes {
    public int count(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n%10==0)
        {
            return 1+count(n/10);
        }
        else
        {
            return count(n/10);
        }
    }

}
class countZeroesUse
{
    public static void main(String[] args) {
        CountZeroes c1= new CountZeroes();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=s.nextInt();
        int ans=c1.count(n);
        System.out.println("The number of zeroes is:" + ans);

    }
}
