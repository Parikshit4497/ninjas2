package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class FactorialRecursion {
    public static  int factorialRec(int n){
        if(n==0){
            return 1;
        }
        int smallAns=factorialRec(n-1);
        int result=smallAns*n;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The factorial " +factorialRec(n) );
        sc.close();
    }
}
