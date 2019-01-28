package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on १०-०८-२०१७.
 */
public class MultiplicationRecursive {
    public int multiplication(int m,int n)
    {
        if(n==0||m==0)
        {
            return 0;
        }
        if(m==1)
        {
            return n;
        }
        if(n==1)
        {
            return m;
        }
        return m+multiplication(m,n-1);

    }
}
class MultiplicationUse
{
    public static void main(String[] args) {
        MultiplicationRecursive m1 =new MultiplicationRecursive();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        int m=s.nextInt();
        System.out.println("Enter the second number");
        int n=s.nextInt();
        int ans=m1.multiplication(m,n);
        System.out.println("The result after multiplication is :" + ans);

    }

        }