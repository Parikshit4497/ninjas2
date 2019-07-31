package RevisionCodingNinjas.Recursion1b;

import java.util.Scanner;

public class ReplaceX {
    public static String strAfterRemovingX(String str1){
        if(str1.length()==0){
            return "";
        }
        if(str1.charAt(0)=='x'){
            return strAfterRemovingX(str1.substring(1));
        }else {
            return str1.charAt(0) + strAfterRemovingX(str1.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1="";
        str1=sc.nextLine();
        System.out.println("The string after removing x" + strAfterRemovingX(str1));
        sc.close();
    }
}
