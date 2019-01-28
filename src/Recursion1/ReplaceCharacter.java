package Recursion;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
     String str1="";
     String str2="";
     String  str3="";
     char ch;
     char ch1;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the string :");
     str1=s.next();
     System.out.println("Enter the charachter that you wish to replace :");
     ch=s.next().charAt(0);
     System.out.println("Enter the character that you wish to replace it with:");
     ch1=s.next().charAt(0);
    str3=replace(str1,ch,ch1,str2,0);
    System.out.println("The string after replacin the character is: "+ str3);

    }
    public static String replace(String str1,char ch,char ch1,String str2,int i)
    {
        if(str1.length()==0)
        {
            return "";
        }
        if(str1.length()==i)
        {
            return str2;
        }
        if(str1.length()==1)
        {
            if(str1.charAt(0)==ch)
            {
                str2=String.valueOf(ch);
                return str2;
            }
            else
            {
                return str1;
            }
        }
        if(str1.length()>1&&i<str1.length()-1)
        {
            if(str1.charAt(i)!=ch)
            {
                str2=str2+str1.charAt(i);
               return  replace(str1,ch,ch1,str2,i+1);
            }
            else
            {
                str2=str2+String.valueOf(ch1);
                return  replace(str1,ch,ch1,str2,i+1);
            }
        }
        str2=str2+str1.charAt(str1.length()-1);
        return str2;
    }
}
