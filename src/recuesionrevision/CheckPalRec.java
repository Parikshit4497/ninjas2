package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on १०-०८-२०१७.
 */
public class CheckPalRec {
    public boolean Palindrome(String str1,int i,boolean result) {
        if (str1.length() == 0) {
            return true;
        }
        if (i < str1.length() / 2)
        {
            if (str1.charAt(i) == str1.charAt(str1.length() - i - 1)) {
                result = true;
            } else {
                return false;
            }
        Palindrome(str1, i + 1, result);
    }
    return result;
    }
}
class CheckPal
{
    public static void main(String[] args) {
        CheckPalRec c1=new CheckPalRec();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str1=s.next();
        boolean result =c1.Palindrome(str1,0,true);
        System.out.println("Is the string palindrome:" + result );


    }
}