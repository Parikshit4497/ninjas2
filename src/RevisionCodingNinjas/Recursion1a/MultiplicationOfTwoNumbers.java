package RevisionCodingNinjas.Recursion1a;

import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
    public static  int productOfTwoNumbers(int m,int n){
        if(n==0){
            return 0;
        }
        int smallAns=productOfTwoNumbers(m,n-1);
        int result=smallAns+m;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Product of the two numbers is" + productOfTwoNumbers(m,n));
        sc.close();
    }
}
