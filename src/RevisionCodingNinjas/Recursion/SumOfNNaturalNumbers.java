package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static int sumOfNnatural(int n){
        if(n==0){
            return 0;
        }
        int smallAns=sumOfNnatural(n-1);
        int result=smallAns+n;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The sum of n natural numbers is "+sumOfNnatural(n));
        sc.close();
    }
}
