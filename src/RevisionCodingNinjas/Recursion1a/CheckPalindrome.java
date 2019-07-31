package RevisionCodingNinjas.Recursion1a;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(String result,int index){
        if(result.length()==1){
            return true;
        }
        if(result.length()/2==index){
            return true;
        }
        if(result.charAt(index)==result.charAt(result.length()-1-index)){
            return  checkPalindrome(result,index+1);
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String result=sc.nextLine();
        System.out.println("The string is palindrome" +checkPalindrome(result,0));
        sc.close();
    }
}
