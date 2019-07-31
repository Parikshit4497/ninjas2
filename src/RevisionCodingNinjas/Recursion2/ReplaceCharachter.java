package RevisionCodingNinjas.Recursion2;

import java.util.Scanner;

public class ReplaceCharachter {
    public static String replaceCharachters(String str1,char ch,char ch1){
        if(str1.length()==1&&str1.charAt(0)!=ch){
            return str1;
        }
        if(str1.length()==1&&str1.charAt(0)==ch){
         return String.valueOf(ch1);
        }
        if(str1.charAt(0)==ch){
            return ch1+replaceCharachters(str1.substring(1),ch,ch1);
        }else{
            return  str1.charAt(0)+replaceCharachters(str1.substring(1),ch,ch1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        char ch1=sc.nextLine().charAt(0);
        System.out.println("String after replacing charachters is" +replaceCharachters(str1,ch,ch1));
        sc.close();
    }
}
