package RevisonComp.Strings;

import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1 ;
        boolean result =false ;
        int i ;
        str1=s.nextLine();
        for(i=0;i<str1.length();i++){
            if(str1.charAt(i)==(str1.charAt(str1.length()-i-1))){
                result=true;
            }else{
                result=false;
                break ;
            }
        }
        System.out.println(result);
    }
}
