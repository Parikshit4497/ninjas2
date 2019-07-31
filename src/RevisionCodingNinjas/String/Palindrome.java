package RevisionCodingNinjas.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        boolean result=false;
        String str="";
        str=sc.nextLine();

        for(i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                result=true;
            }else{
                result=false;
                break;
            }
        }
        System.out.println("Result" +result);
        sc.close();
    }
}
