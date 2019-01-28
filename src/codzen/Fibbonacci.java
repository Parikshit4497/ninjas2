package codzen;

import java.util.Scanner;

/**
 * Created by hp on १६-०६-२०१७.
 */
public class Fibbonacci {
    public static void main(String[] args) {


        int n, i;
        int c,a,b;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        a=input.nextInt();
        b=input.nextInt();
        for (i = 0; i <= n; i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ") ;
        }
    }
}
