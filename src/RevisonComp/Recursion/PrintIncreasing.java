package RevisonComp.Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void printIncre(int n){
        if(n==0){
            return;
        }
        printIncre(n-1);
        System.out.println("The number is " + n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printIncre(n);
    }
}
