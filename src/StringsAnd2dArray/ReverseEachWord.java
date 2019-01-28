package StringsAnd2dArray;

import java.util.Scanner;

/**
 * Created by hp on २२-०६-२०१७.
 */
public class ReverseEachWord {
    public static void main(String[] args) {
        String input;
        String str2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string ");
        input=s.nextLine();
      str2=reverseEachWord(input);
       System.out.println("The string is "+str2);
    }
    public static String reverseEachWord(String input) {

         char ch=32;
         int i,j=0,k=0;
         int index;
         String str1="",str="";
         String s2=(" ");
         for(i=0;i!=input.length();) {
         while(i<input.length()&&input.charAt(i)!=ch)
         {

             i++;
         }
         j=i-1;
         while(j>=k)
         {
             str=str+input.charAt(j);
             j--;
         }

         k=i;
         str1+=str;
         str1+=s2;
         str="";
         i++;
         }




         return str1;
    }

}
