package RevisonComp;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        int a;
        int b;
        int c=0;
        int n,i;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        a=s.nextInt();
        b=s.nextInt();
        for(i=0;i<n;i++)
        {
            c=a+b;
            System.out.println("a"+a+"b" +b +"c" +c);
            a=b;
            b=c;
           if(i==n-2){
               System.out.println(c);
           }

        }
    }
}
