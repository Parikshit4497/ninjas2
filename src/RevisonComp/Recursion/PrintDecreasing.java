package RevisonComp.Recursion;

import java.util.Scanner;

public class PrintDecreasing {
    public static void printDecreasing(int n){

        System.out.print(n +" ");
        if(n==1){
            return;
        }
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printDecreasing(n);
    }
}
