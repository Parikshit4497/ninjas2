package RevisionCodingNinjas.Recursion1b;

import java.util.Scanner;

public class ReplaceWithPi {
    public  static  String replacewithPi(String str1){
        if(str1.length()==2&&str1.substring(0,2).equals("pi")){
            return "3.14";
        }if(str1.length()==1){
            return str1;
        }
        if(str1.substring(0,2).equals("pi")){
            return "3.14"+replacewithPi(str1.substring(2));
        }else{
            return str1.charAt(0)+replacewithPi(str1.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("The result is "+ replacewithPi(str1) );
        sc.close();
    }
}
