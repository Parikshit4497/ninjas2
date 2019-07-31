package RevisionCodingNinjas.Recursion1b;

import java.util.Scanner;

public class PairStar {
    public static  String pairStar(String str1){
        if(str1.length()==1){
            return str1;
        }
        if(str1.equals("")){
            return str1;
        }
        if(str1.charAt(0)==str1.charAt(1)){

            return str1.charAt(0)+"*"+pairStar(str1.substring(1)) ;
        }else{
           return str1.charAt(0)+pairStar(str1.substring(1)) ;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2="";
        System.out.println("The string after adding star " +pairStar(str1) );
        sc.close();
    }
}
