package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void printDecreasingIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.print(n +" ");
        printDecreasingIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        printDecreasingIncreasing(n);

        sc.close();
    }
}
