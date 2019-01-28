package Test;

import java.util.Scanner;

/**
 * Created by hp on १०-०७-२०१७.
 */
public class MinimumLengthWord {
    public static void main(String[] args) {
        String str = "";
        String str1="";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = s.nextLine();
        str1 = MinlenWord(str);
        System.out.println("The minimum length of the word in the string is " + str1);
    }

    public static String MinlenWord(String str) {
        char ch=32;
        int count=0;
        int startindex=0;
        int endindex=0;
        int k=0;
        String str2="";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<str.length();)
        {
          count=0;
          while(i<str.length()&&str.charAt(i)!=ch)
          {
              count++;
              i++;
          }
          if(min>count)
          {
              min=count;
              startindex=k;
              endindex=i;
          }
          k=i;
            i++;
        }
        str2=str.substring(startindex,endindex);
       return str2 ;
    }
}