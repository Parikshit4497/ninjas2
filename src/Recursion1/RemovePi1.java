package Recursion1;

import java.util.Objects;
import java.util.Scanner;


public class RemovePi1 {
    public static void main(String[] args) {
        String str1="";
        String str2="";
        String str="";
        String st="pi";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        str1=s.next();
        str2=replace1(str1,0,st,str);
        System.out.println("The string after conversion is " + str2);
    }
    public static String replace1(String str1,int i,String st,String str)
    {
            String st1="i";
            String str3="";
            if(str1.length()==1)
            {
                return str1;
            }
        if(str1.length()==2)
        {
            if("pi".equals(str1))
            {
                return "3.14";
            }
            else
            {
                return str1;
            }
        }
        if(i==str1.length())
        {
            return str;
        }


        if(i<str1.length()-1&&str1.length()>2)
        {
            if("pi".equals(str1.substring(i, i + 2)))
            {

                str=str+String.valueOf(3.14);
                return replace1(str1,i+1,st,str);
            }
            else if((!"pi".equals(str1.substring(i, i + 2))&&(i<1)))
            {
                str=str+str1.charAt(i);
                return  replace1(str1,i+1,st,str);

            }
            else if((!"pi".equals(str1.substring(i, i + 2)))&&(!"pi".equals(str1.substring(i-1,i+1)))&&i>0)
            {
                str=str+str1.charAt(i);
                return  replace1(str1,i+1,st,str);

            }

               else
            {
                return replace1(str1,i+1,st,str);
            }

        }
           if(((!"pi".equals(str1.substring(str1.length()-2))))) {
            str3= str + str1.substring(str1.length() - 1);
        }
        else {
            str3=str;
        }
        return str3;
    }
}


