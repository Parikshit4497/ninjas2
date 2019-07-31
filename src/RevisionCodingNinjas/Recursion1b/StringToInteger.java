package RevisionCodingNinjas.Recursion1b;

import java.util.Scanner;

public class StringToInteger {
    public static int convertIntToString(String str1){
        if(str1.length()==1){
            return  str1.charAt(0)-'0';
        }
        int smallAns=convertIntToString(str1.substring(0,str1.length()-1));
        int outPutDigit=str1.charAt(str1.length()-1)-'0';
        return smallAns*10+outPutDigit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();

        System.out.println("The value of string after converting it to integer " +convertIntToString(str1));

        sc.close();
    }
}
