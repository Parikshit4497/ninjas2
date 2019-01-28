package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on १०-०८-२०१७.
 */
public class ConvertStringToInteger {

    public int ConvertToInt(String str1,int sum)
    {
        if(str1.length()==0)
        {
            return sum;
        }
        char ch,ch1='0';
        int a;
        int b=ch1;
        if(str1.length()!=0)
        {
            ch=str1.charAt(0);
            a=ch;
            sum=sum*10+(a-b);
            return ConvertToInt(str1.substring(1),sum);
        }
        return sum;
    }
}
class StringUse
{
    public static void main(String[] args) {
        ConvertStringToInteger c1=new ConvertStringToInteger();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1=s.next();
        int sum=0;
        int ans=c1.ConvertToInt(str1,sum);
        System.out.println("THe string after converting to integer is:" + ans);
    }
}