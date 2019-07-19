package RevisionCodingNinjas.ProgrammingFundamentals2a;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0,j=0;
        int isPrime;
        n=sc.nextInt();
        for(i=2;i<=n;i++){
            isPrime=0;
            for(j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime++;
                    break;
                }
            }
            if(isPrime==0){
                System.out.println(i);
            }
        }
    }
}
