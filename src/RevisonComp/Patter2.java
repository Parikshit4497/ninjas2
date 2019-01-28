package RevisonComp;

import java.util.Scanner;

public class Patter2 {
    public static void main(String[] args) {
        int i;
        int j;
        int a=1;
        int n,m;
        int k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=n;
        for( i=0;i<=n;i++){
             a=i;

           for(k=0;k<m;k++)
           {
               System.out.print(" ");

           }
            for(j=0;j<i;j++){
                System.out.print(a);
                a++;

            }
            System.out.println();
            m--;
        }
    }
}
