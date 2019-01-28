package StringsAnd2dArray;

import java.util.Scanner;

/**
 * Created by hp on २२-०६-२०१७.
 */
public class ReplaceAChar {
    public static void main(String[] args) {
        String input="",str1="";
        char ch1,ch2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        input=s.next();
        System.out.println("Enter the character you wish to replace in the string :");
        ch1=s.next().charAt(0);
        System.out.println("Enter the charachter that you wish to replace :");
        ch2=s.next().charAt(0);
        str1=replaceCharacter(input,ch1,ch2);
        System.out.println("The string is" +str1);
    }

    public static String replaceCharacter(String input, char ch1, char ch2) {
		  int i;
		  String input1=" ";
           for(i=0;i<input.length();i++)
           {
               if(input.charAt(i)==ch1)
               {
                   input1+=ch2;

               }
               else
               {
                   input1+=input.charAt(i);
               }
           }
           return input1;
    }
}
