package RevisonComp.Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1="";
        String str2="";
        int i ,j;
        str1=s.nextLine();
        System.out.println("String length " + str1.length());
        for( i =0 ;i<str1.length();i++){
            str2+=str1.charAt(i);
            for(j=i+1;j<str1.length();j++){
                System.out.println("substring are " +str2);

                str2+=str1.charAt(j);
            }
            System.out.println("substring are " +str2);
            str2="";
        }
    }
}
