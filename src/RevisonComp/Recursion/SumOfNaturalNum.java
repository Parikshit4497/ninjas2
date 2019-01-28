package RevisonComp.Recursion;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static int sumOfNat(int n){
        if(n==1){
            return  1;
        }
          return  sumOfNat(n-1)+ n;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N;
        N=s.nextInt();
        System.out.println("The sum of first N natural numbers is " + sumOfNat(N));
    }
}
