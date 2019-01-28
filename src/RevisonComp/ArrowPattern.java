package RevisonComp;

import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        int l;
        int k ;
        int i;
        int j;
        int m;
        n=s.nextInt();
        for(i =0;i<n;i++){
            for(l=0;l<i;l++){
                System.out.print(" ");
            }
            for(k=0;k<=i ;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<n-1;i++){
            for(l=0;l<n-i-2;l++){
                System.out.print(" ");
            }
            for(k=n-i-1;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
