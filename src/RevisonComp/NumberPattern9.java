package RevisonComp;

import java.util.Scanner;

public class NumberPattern9 {
    public static void main(String[] args) {
        int i,j,n,m,k,l;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            m=n-i;
            for(j=0;j<i;j++)
            {
                m++;
                System.out.print(m);
            }
            for(k=j;k<n;k++)
            {
                System.out.print(n);
            }
            System.out.print("\n");
        }
    }
}
