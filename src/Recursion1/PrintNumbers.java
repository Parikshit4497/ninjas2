package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on २१-०६-२०१७.
 */
public class PrintNumbers {
    public static void main(String[] args) {
        int n ;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        print(n);
    }
    public static void print(int n){

        if(n==0)
        {
            return ;
        }
        print(n - 1);
        System.out.print(n+" ");

    }

}
