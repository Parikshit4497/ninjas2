package Online.Variabeles.ControlFlow;

import java.util.Scanner;

public class Sum3and5 {
    public static void main(String[] args) {
        int sum=0;
        int start;
        int end;
        int si=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the starting point");
        start=s.nextInt();
        System.out.println("Enter the ending point ");
        end=s.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(i%3==0&&i%5==0)
            {
                sum=sum+i;
                System.out.println("Sum after "+ i+ " iteration:"+ sum );
                si++;
                System.out.println("The number of digits is:" +si);
                if(si==5)
                {
                    break;
                }
            }

        }
        System.out.println("The sum of numbers is "+  sum);
    }
}
