package RevisionCodingNinjas;

import java.util.Scanner;
public class SumOfEvenTillN {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N;
        int sum=0;
        System.out.println("Enter the value of N");
        N=s.nextInt();
        for(int i=0;i<=N;i++)
        {
           sum=sum+i;
        }
        System.out.println("The sum of the numbers is:" + sum );
    }
}
