package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on १०-०८-२०१७.
 */
public class SumOfDigits {
    public int CalSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int a=n%10;
        return a+CalSum(n/10);

    }

}
class SumUse
{
    public static void main(String[] args) {
        SumOfDigits s1=new SumOfDigits();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=s.nextInt();
        int ans=s1.CalSum(n);
        System.out.println("The sum of teh digits is " + ans);
    }
}