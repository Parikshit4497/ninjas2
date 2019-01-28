package RevisonComp;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        int i;
        int j;
        int n,d;
        int k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        d=n;
        for( i=0;i<=n;i++)
        {
               for(k=0;k<d;k++ )
               {
                   System.out.print(" ");
               }
               d--;
                for (j = 0; j <2*i-1; j++) {
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}
