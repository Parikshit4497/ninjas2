package RevisonComp;

import java.util.Scanner;

public class NumberPattern6 {
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        int k;
        int d;
        Scanner s=new Scanner(System.in);
        n =s.nextInt();
        d=n;
        int a=0;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=d;k++)
            {
                System.out.print(" ");
            }
            d--;
            for (j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
