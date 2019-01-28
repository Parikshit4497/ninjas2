package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on २७-०६-२०१७.
 */
public class SeperateDuplicates {
    public static void main(String[] args) {
        String str1="";
        String str2="";
        String str3="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        str1=s.next();
        str3=stars(str1,0,str2);
        System.out.println("The string is after changing is "+str3);
    }
    public static String stars(String str1,int i,String str2)
    {
            String str4="*";
            if(str1.length()==0)
            {
                return "";
            }
            if(str1.length()==2)
            {
                if(str1.charAt(0)==str1.charAt(1))
                {
                    str2=str1.charAt(0)+str4+str1.charAt(1);
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
                   return  stars(str1,i+1,str2);
                }
                if(str1.charAt(i)==str1.charAt(i+1))
                {    str2=str2+str1.charAt(i)+str4;
                    return stars(str1,i+1,str2);
                }
            }
            str2=str2+str1.charAt(str1.length()-1);
        return str2;
    }
}

