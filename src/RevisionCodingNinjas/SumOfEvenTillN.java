package RevisionCodingNinjas;

import java.util.Scanner;

public class SumOfEvenTillN {
    public static void main(String[] args) {
        int N=0;
        int sum=0;
        int i=0;
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        while(i<N){
            sum+=i;
            i+=2;
        }
        System.out.println("The sum of even number is " + sum);
    }
}
