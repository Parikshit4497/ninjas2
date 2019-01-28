package Recursion1;


import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        String input="",str2="";
        String str1="";
        char ch;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string ");
        input=s.next();
        System.out.println("Enter the chracter you wish to replace:");
        ch=s.next().charAt(0);
       str1=change(input,0,ch,str2);
       System.out.println("The new string is: " + str1);
    }
    public static String change(String str,int i,char ch,String str2)
    {

            if(str.length()==i)
            {
                return str2;
            }
            if(str.length()==1)
            {
                if(str.charAt(i)==ch)
                {
                    return "";
                }
                else
                {
                    return str;
                }
            }
            if(str.charAt(i)!=ch)
            {
                str2+=str.charAt(i);
                return change(str,i+1,ch,str2);
            }
            else{
               return change(str,i+1,ch,str2);
            }

    }
}
