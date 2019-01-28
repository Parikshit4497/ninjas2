package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on २८-०६-२०१७.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str1="";
        String str2="",str3="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        str1=s.next();
        str3=Duplicates(str1,0,str2);
        System.out.println("The  string after removing duplicates is " +str3);
    }
    public static String Duplicates(String str1,int i,String str2)
    {
        if(str1.length()==0)
        {
            return "";
        }
        if(str1.length()==i)
        {
            return str2;
        }
        if(str1.length()==2)
        {
            if(str1.charAt(i)==str1.charAt(i+1))
            {
                str2=str1.substring(0);
                return str2;
            }
            else
            {
                return str1;
            }
        }
        if(str1.length()>2&&i<str1.length()-1)
        {
            if(str1.charAt(i)!=str1.charAt(i+1))
            {
                str2=str2+str1.charAt(i);
               return  Duplicates(str1,i+1,str2);
            }
            else
            {
              return Duplicates(str1,i+1,str2);
            }
        }
        str2=str2+str1.substring(str1.length()-1);
      return str2;
    }
}
