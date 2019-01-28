package RevisonComp.Strings;

import java.util.Scanner;

public class ReverseEachWordRev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = "", str2 = "";
        // String splitArray[];
        int i, j;
        String str3 = "";
       /* StringBuilder sb=new StringBuilder();
        str1=s.nextLine();
        splitArray=str1.split(" ");
        for(i=0;i<splitArray.length;i++){
            sb.insert(0,splitArray[i]);
            str2+=sb.reverse() + " ";
            sb.delete(0,splitArray[i].length());
        }
        System.out.println("The reversed string is " + str2)
        ;*/
        str1 = s.nextLine();
        for (i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                str2 += str1.charAt(i);
            }
            if ((str1.charAt(i) == ' ') || (i == str1.length() - 1)) {
                for (j = str2.length() - 1; j >= 0; j--) {
                    str3 += str2.charAt(j);
                    if (j == 0 && i != (str1.length() - 1)) {
                        str3 = str3 + ' ';
                    }
                }
                str2 = "";
            }
        }
        System.out.println("The reversed string is " + str3);
    }
}

