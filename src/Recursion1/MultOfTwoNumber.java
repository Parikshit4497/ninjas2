package Recursion1;


import java.util.Scanner;

public class MultOfTwoNumber{
    public static void main(String[] args) {
        int n,m,g;
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the first number:");
        n=s.nextInt();
        System.out.println("Enter the second number:");
        m=s.nextInt();
        g=multiplication(m,n);
        System.out.println("The product of two number is:"+ g);
    }
    public static int multiplication(int m,int n)
    {
        if(m==1)
        {
            return n;
        }
        if(m==0||n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return m;
        }
        return n+multiplication(n,m-1);
    }
 }
