package StringsAnd2dArray;

import java.util.Scanner;

/**
 * Created by hp on २२-०६-२०१७.
 */
public class AllSubstringOfString {
    public static void main(String[] args) {
        String str;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        str=s.next();
        printSubstrings(str);

    }
    public static void printSubstrings(String str){
        int i,j,k;
        String str1="";
        char s2;
        for(i=0;i<str.length();i++)
        {

                for(j=i;j<str.length();j++) {


                        s2 = str.charAt(j);
                        str1 +=s2;


                        System.out.println(str1);

            }
            str1="";
        }

    }
}
