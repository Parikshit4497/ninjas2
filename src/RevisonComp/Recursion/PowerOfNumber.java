package RevisonComp.Recursion;

import java.util.Scanner;

public class PowerOfNumber {
    public static int powerOfNumber(int N,int X){
        if(X==0){
            return 1;
        }
        if(X==1){
            return  N;
        }
        return N*powerOfNumber(N,X-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N,X;
        N=s.nextInt();
        X=s.nextInt();
        System.out.println("The result of " + N + " raise to power " + X + " is " +powerOfNumber(N,X) );
    }
}
