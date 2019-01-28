package codzen;

import java.util.Scanner;

/**
 * Created by hp on ०१-०७-२०१७.
 */
public class Equation {
    public static void main(String[] args) {
        int n,i,x,sum=0,a=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elemnts in teh array :");
                n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the coeffecients of the quadratic eqution:");
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the value of x");
        x=s.nextInt();
        for(i=n-1;i>=0;i--)
        {
            sum=sum+arr[i]*a;
               a=a*x;
        }
        System.out.println(sum);
    }
}
