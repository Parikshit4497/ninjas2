package RevisionCodingNinjas.ProgrammingFundamentals2a;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0,j=0;
        int k=0,a=0;
        n=sc.nextInt();
        for(i=n;i>=1;i--){
            a=i;
            for(j=n;j>=i;j--){
                System.out.print(a++);
            }
            for(k=i;k>1;k--){
                System.out.print(n);
            }
            System.out.println();
        }

    }
}
