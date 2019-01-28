package Test;

import java.util.Scanner;

/**
 * Created by hp on १०-०७-२०१७.
 */
public class AllStrings {
    public static void main(String[] args) {
        String str1="";
        int n,i;
        String str[];
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the string :");
        str1=s.nextLine();
        System.out.println("Enter the number:");
        n=s.nextInt();
        str=combinations(str1,n);
        for(i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
    }
    public static String[] combinations(String str1,int n)
    {
        String str2[]=new String[str1.length()*str1.length()];
        int i,j;
        int k=0;
        char ch;
        String str3="";
        for( i=0;i<str1.length();i++)
        {
            loopname:for( j=0;j<str1.length();j++)
            {   ch=str1.charAt(i);
                str3=str3+ ch+str1.charAt(j);
                if(str3.length()<n)
                {
                    continue loopname;
                }
                else if(str3.length()==n)
                {
                    str2[k++]=str3;
                }

                else
                {
                    str3="";

                }

            }
        }
        return str2;
    }
}
