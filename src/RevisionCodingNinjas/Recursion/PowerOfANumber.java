package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class PowerOfANumber {
    public static  int PowerOfANumber(int x ,int n){
        if(n==0){
            return 1;
        }
        int smallAns=PowerOfANumber(x,n-1);
        int result=smallAns*x;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("The power of the number is " +PowerOfANumber(x,n)) ;
        sc.close();
    }
}
