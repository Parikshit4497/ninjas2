package RevisonComp.Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static  int sumOfDigits(int m){
        if(m==0){
            return  0;
        }
        if(m==1){
            return 1;
        }
        int a=m%10;
        return sumOfDigits(m/10)+a;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        System.out.println("The sum of digits o the number is " + sumOfDigits(m));
    }
}
