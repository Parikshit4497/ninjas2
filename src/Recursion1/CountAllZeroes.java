package Recursion1;

import java.util.Scanner;

/**
hrty on २६-०६-२०१७.
 */
public class CountAllZeroes {
    public static void main(String[] args) {
        int num;
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=s.nextInt();
        count=countzeroes(num);
        System.out.println("Then umber of zeroes is " +count);
    }
    public static int countzeroes( int num)
    {

        if(num==0) {
            return 0;
        }

        if(num%10==0)
        {
        return 1+ countzeroes(num/10);
        }
        else
        {
            return countzeroes(num/10);
        }

    }
}
