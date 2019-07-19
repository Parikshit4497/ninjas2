package RevisionCodingNinjas.ProgrammingFundamentals1b;

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {
        int n=0,i=0;
        int j=0,k=65;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)k);
            }
            k=k+1;
            System.out.println();
        }
    }
}
