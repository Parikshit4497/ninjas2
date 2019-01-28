package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on २१-०६-२०१७.
 */
public class NumberOfDigits {
    public static void main(String[] args) {
        int n,g=0 ;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        g=count(n);
        System.out.println("The number of digits is:" +g);
    }
    public static int count(int n){

        if(n == 0){
            return 0;
        }

        int smallAns=count(n/10);

            return smallAns +1 ;



    }
}
