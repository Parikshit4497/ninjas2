package Lecture2;

import java.util.Scanner;
public class assignment2bQ1 {

    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        int n,i,num;
        int sum=0,pro=1;
        System.out.println("Enter the value of n :");
        n=input.nextInt();
        System.out.println("Enter 1 If you wish to find the product of first n numbers or enter"+"0 to find the sum of first n numbers:");
        num=input.nextInt();
        if(num==1)
        {
            for(i=0;i<=n;i++)
            {
                sum=sum+i;
            }
            System.out.println("The sum of the numbers is:" +sum );
        }
        else if(num==0)
        {
            for(i=1;i<=n;i++)
            {
                pro=pro*i;
            }
            System.out.println("The product of the numbers:"+pro);
        }

    }



}
