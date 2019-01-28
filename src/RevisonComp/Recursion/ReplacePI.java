package RevisonComp.Recursion;

import java.util.Scanner;

public class ReplacePI {
    public static  String replacePI(String str1,String str2,int count ){
        if(str1.length()==1){
            return str1;
        }

        if(count==str1.length()-1){
            str2+=str1.charAt(str1.length()-1);
            return str2;
        }
        if(count<str1.length()) {
            if (str1.substring(count, count + 2).equals("pi")) {
                str2 += "3.14";
                return replacePI(str1, str2, count + 2);
            } else {
                str2 += str1.charAt(count);
                return replacePI(str1, str2, count + 1);
            }
        }

        return  str2;
    }
    public static  String  replacPi1(String string1,String string2){

        if(string1.length()==0){
            return string2;
        }
        if(string1.charAt(0)=='p'&&string1.charAt(1)=='i'){

            string2+="3.14";
            return replacPi1(string1.substring(2),string2);
        }else{
            string2+=string1.charAt(0);
            return replacPi1(string1.substring(1),string2);
        }


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         String str1=s.next();
                String str2="";
String str3="";
        System.out.println("The modified string is " + replacePI(str1,str2,0));
        System.out.println("The modified string is " + replacPi1(str1,str3));
    }
}
