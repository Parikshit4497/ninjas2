package RevisonComp.Strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str1="" ;
        String splitArr[] ;
        StringBuilder  sb=new StringBuilder();
        String str3="";
        str1=s.nextLine();

        int i;
        splitArr=str1.split(" ");
        for(i=0;i<splitArr.length;i++){
            sb.insert(0,splitArr[i]);
            str3+=sb.reverse();
            str3+=" ";
            sb.delete(0,splitArr[i].length());
        }
        System.out.println("The reversed string is " + str3);

    }
}
