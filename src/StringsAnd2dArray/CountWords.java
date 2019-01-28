package StringsAnd2dArray;

import java.util.Scanner;

/*
 * Created by hp on २२-०६-२०१७.
 */
public class CountWords {
    public static void main(String[] args) {
        String  str="";
        int d;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        str=s.nextLine();
        d=countWords(str);
        System.out.println("The number of words is " +d);
    }
    public static int countWords(String str){

		int i,c=0,d;
		char ch=32;
		for(i=0;i<str.length();i++)
        {

            if(str.charAt(i)==ch)
            {
                c++;
            }
        }
           d=c+1;
		return d;
    }
}
