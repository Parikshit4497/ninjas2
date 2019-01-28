package RevisonComp;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int i;
        int j;
        int a=1;
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            a=i;
            for(j=0;j<i;j++)
            {

                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
