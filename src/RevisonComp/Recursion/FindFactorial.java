package RevisonComp.Recursion;

import java.util.Scanner;

public class FindFactorial {
    public static long factorial(int n){
        if(n==0){
            return 1;
        }
        long smallAns=factorial(n-1);
        long ans=smallAns*n;
        return  ans ;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long ans =factorial(n);
        System.out.println("The factorial of the number " + n + " is " + ans );
    }
}
