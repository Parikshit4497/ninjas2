package RevisionCodingNinjas.Recursion2;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicates(String str1){
        if(str1.length()==1){
            return str1;
        }
        if(str1.charAt(0)!=str1.charAt(1)){
            return  str1.charAt(0)+removeDuplicates(str1.substring(1));
        }else{
            return removeDuplicates(str1.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  str1=sc.nextLine();

        System.out.println("The string after removing duplicates is "+removeDuplicates(str1));
        sc.close();
    }
}
