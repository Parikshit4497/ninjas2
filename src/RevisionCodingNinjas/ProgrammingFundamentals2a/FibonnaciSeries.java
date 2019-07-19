package RevisionCodingNinjas.ProgrammingFundamentals2a;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0;
        int i=0,n=0;
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
