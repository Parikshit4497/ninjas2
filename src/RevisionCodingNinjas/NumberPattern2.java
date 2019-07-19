package RevisionCodingNinjas;

import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        int i=0,j=0,k=0;
        int n=0,a=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            a=i;
            for(k=1;k<=i;k++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
