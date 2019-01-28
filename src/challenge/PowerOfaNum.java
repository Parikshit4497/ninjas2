package challenge;

import java.util.Scanner;

public class PowerOfaNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double m;
        int n;
        System.out.println("Enter the value of base: ");
        m=s.nextDouble();
        System.out.println("Enter the value of the power:");
        n=s.nextInt();
        double ans=powerOfNum(m,n);
        System.out.println("The result of the num is: " + ans);
        System.out.println("Enter the value of base: ");
        m=s.nextDouble();
         ans=powerOfNum(m,2);
        System.out.println("The result of the num is: " + ans);
    }
    public static double  powerOfNum(double m,int n)
    {
        if(m==0)
        {
            return 0;
        }
        if(n==1)
        {
            return m;
        }
        if(m==1)
        {
            return 1;
        }
      return m*powerOfNum(m,n-1);
    }

}
