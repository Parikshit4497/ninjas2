package RevisonComp.Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1="";
        String splitArr[];
        str1=s.nextLine();
        splitArr=str1.split(" ");
        System.out.println("The no of words " + (splitArr.length));
    }
}
