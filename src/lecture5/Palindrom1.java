package lecture5;

import java.util.Scanner;

/**
 * Created by hp on १७-०६-२०१७.
 */
public class Palindrom1 {
    public static void main(String[] args) {


        String palindrome;
        int i, flag=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string  which u wish to check it is palindrom or not");
        palindrome = input.next();
        for (i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1)) {
                flag = 0;
            } else {
                flag = 1;
            }
        }
    if(flag==0)

    {
        System.out.println("The string is palindrome:");
    }
    else
    {
        System.out.println("The string is not palindrome:");
    }
}
}
