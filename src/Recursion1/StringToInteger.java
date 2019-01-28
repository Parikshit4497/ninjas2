package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on २७-०६-२०१७.
 */
public class StringToInteger {
    public static void main(String[] args) {
        String str="";
        int num;
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        str=s.next();
        num=convert(str,0,sum);
        System.out.println("The number is " +num);

    }
    public static int convert(String str,int i,int sum) {
        char ch,ch1='0';
        int a;
        int b=ch1;
        if (str.length() == 0) {
            ch = 32;
            return ch;
        }
        if(str.length()==1)
        {
            ch=str.charAt(0);
            a=ch;
            return (a-b);
        }
         if (i==str.length())
        {
            return sum;
        }
        if(i<str.length())
        {
            ch=str.charAt(i);
            a=ch;
            sum=sum*10+(a-b);
            return   convert(str,i+1,sum);
        }


        return sum;

    }
}
