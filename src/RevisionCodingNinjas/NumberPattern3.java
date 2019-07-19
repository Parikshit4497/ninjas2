package RevisionCodingNinjas;

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        int i=0,j=0,n=0;
        int k=0,d=0,l=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            d=i;
            for(j=0;j<=n-i-1;j++){
                System.out.print("  ");
            }
            for(k=0;k<=i;k++){
                d++;
                System.out.print(d+" ");

            }
            for(l=0;l<i;l++){
                d--;
                System.out.print(d+" ");

            }
            System.out.println();
        }

    }
}
