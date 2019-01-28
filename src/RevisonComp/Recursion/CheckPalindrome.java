package RevisonComp.Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(String string, int count) {
    if(string.length()==1){
    return true ;
    }
    if(string.length()/2==count){
         return  true ;
    }
    if(string.charAt(count)==string.charAt(string.length()-count-1)){
        return checkPalindrome(string,count+1);
    }else{
        return  false;
    }

}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.next();
        boolean result=checkPalindrome(string,0);
        System.out.println("The give string is palindrome " + result);
    }
}
