package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ०९-०८-२०१७.
 */
public class PrintNumInInc {
    public void PrintNum(int n)
    {
        if(n==0)
        {
            return ;
        }

        System.out.print(n+" ");
        PrintNum(n-1);
        System.out.print(n+" ");
    }
}
 class PrintNumUse
{
    public static void main(String[] args) {
        PrintNumInInc p1 =new PrintNumInInc();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number from which you wish to print numbers in decreasing order");
        int n=s.nextInt();
        p1.PrintNum(n);

    }
}