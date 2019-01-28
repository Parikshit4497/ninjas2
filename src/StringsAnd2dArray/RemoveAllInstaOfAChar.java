package StringsAnd2dArray;

import java.util.Scanner;

/***
 * Created by hp on २५-०६-२०१७.
 */
public class RemoveAllInstaOfAChar {
    public static void main(String[] args) {
        String input="";
        char c;
        String str1="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        input=s.nextLine();
        System.out.println("enter the character whose instances you wish to remove");
        c=s.next().charAt(0);
        str1=removeAllOccurrencesOfChar(input,c);
        System.out.println("The sting after removing all occurrence of character is " + str1);
    }

    public static String removeAllOccurrencesOfChar(String input, char c) {

        String str="";
        int i,j;
       loopname: for(i=0;i<input.length();i++)
        {
            if(input.charAt(i)==c)
            {
                continue loopname;
            }
            else
            {
                str+=input.charAt(i);
            }
        }
         return str;

    }
}
