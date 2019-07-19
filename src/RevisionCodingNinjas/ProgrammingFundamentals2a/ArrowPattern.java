package RevisionCodingNinjas.ProgrammingFundamentals2a;

import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0,k=0;
        int j=0,i=0;
        int no,ne;
        n=sc.nextInt();
        if(n%2==0) {
            for (i = 0; i <= n / 2; i++) {
                for (j = 0; j < i - 1; j++) {
                    System.out.print(" ");
                }
                for (k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (i = n / 2; i >= 0; i--) {
                for (j = 0; j < i - 1; j++) {
                    System.out.print(" ");
                }
                for (k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else{
            for (i = 0; i <= (n / 2+1); i++) {
                for (j = 0; j < i - 1; j++) {
                    System.out.print(" ");
                }
                for (k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (i = n / 2; i >= 0; i--) {
                for (j = 0; j < i - 1; j++) {
                    System.out.print(" ");
                }
                for (k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }

      }
}
