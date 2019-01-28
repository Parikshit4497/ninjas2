package RevisonComp.Recursion;

import java.util.Scanner;

public class PairStar {
    public  static String replacePairwithStar(String string1,String string2){

        if (string1.equals("")){
            return string2;
        }
        if(string1.charAt(0)==string1.charAt(1)){
            string2+=string1.charAt(0) + "*" + string1.charAt(1);
         return    replacePairwithStar(string1.substring(2),string2);
        }else{
            string2+=string1.charAt(0);
            return replacePairwithStar(string1.substring(1),string2);
        }

    }
    public  static  String replacePairwithStar (String string1){
        if(string1.length()<=1){
            return string1;
        }
        String out =replacePairwithStar(string1.substring(1));
        if(string1.charAt(0)==string1.charAt(1)){
            out=string1.charAt(0)+"*" +string1.charAt(1)+out.substring(1);
        }else{
            out= string1.charAt(0)+out;
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string1="";
        String string2="";
        string1=s.next();
        System.out.println("The string after removing pairs " + replacePairwithStar(string1));
    }
}
