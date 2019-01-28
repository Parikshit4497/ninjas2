package RevisonComp.Recursion;

import java.util.Scanner;

public class Numberofdigits {
    public static int  countDigitsNum(int n){

        if(n==0) {
            return 0;
        }

     n=countDigitsNum(n/10);
        return n+1;
    }    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int num;
        num=s.nextInt();
        System.out.println("The number of digits in the number are " + countDigitsNum(num));


    }

}
