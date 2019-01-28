package RevisonComp;

import java.util.Scanner;

public class NumberPattern7 {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int n;
        int a;
        int d;
        int l;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        d=n;
        for( i=0;i<=n;i++){
            for(k=0;k<d;k++)
            {
                System.out.print(" ");
            }
            d--;
            a=i;
            for(j=0;j<=i;j++){
                a++;
                System.out.print(a);
            }
            for(l=0;l<=i-1;l++)
            {
                a--;
                System.out.print(a);
            }
            System.out.println();
        }

    }
}
