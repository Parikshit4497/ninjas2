package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ०९-०८-२०१७.
 */
public class FindPower {
    public int powerOfnum(int n,int m)
    {
        if(n==0)
        {
            return 0;
        }
        if(m==0)
        {
            return 1;
        }

        int count=powerOfnum(n,m-1);
        return n*count;
    }

}
class PowerUse
{
    public static void main(String[] args) {
        FindPower f1=new FindPower();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=s.nextInt();
        System.out.println("Enter the power of the number ");
        int m=s.nextInt();
        int result=f1.powerOfnum(n,m);
        System.out.println("The result of the number is: " + result);

    }
}