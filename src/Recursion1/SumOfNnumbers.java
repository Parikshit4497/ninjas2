package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on २१-०६-२०१७.
 */
public class SumOfNnumbers {
    public static void main(String[] args) {
        int n,g=0 ;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        g=sum(n);
        System.out.println("The sum of n digits is:" +g);
    }
    public static int sum(int n) {

         if(n==1)
         {
             return n;
         }
         if(n==0)
         {
             return 0;
         }
         return n+sum(n-1);
    }
}
