package RevisonComp;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        int isprime=0;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        for(i=2;i<=n;i++)
        {   isprime=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    isprime++;
                    break;
                }

            }
            if(isprime==0){
                System.out.println(i);
            }
        }
    }
}
