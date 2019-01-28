package RevisonComp;

import java.util.Scanner;

public class NumberPattern8 {
    public static void main(String[] args) {
        int i ;
        int j;
        int k;
        int l;
        int m ;
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        l=n;

        for (i=0;i<=n;i++)
        {
            for(j=0;j<l;j++){
                System.out.print("  ");
            }
            l--;
            for(k=0;k<2*i-1;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        l=n-1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i+1;j++)
            {
                System.out.print("  ");
            }
            for (k=0;k<2*l-1;k++){
                System.out.print("* ");
            }
            l--;
            System.out.println();

        }

    }
}
