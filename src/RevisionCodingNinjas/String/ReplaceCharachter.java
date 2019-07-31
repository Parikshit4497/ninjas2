package RevisionCodingNinjas.String;

import java.util.Scanner;

public class ReplaceCharachter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        String result="";
        int i=0;
        char ch1,ch2;

        str=sc.nextLine();
        ch1=sc.nextLine().charAt(0);
        ch2=sc.nextLine().charAt(0);
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==ch1){
                result+=ch2;
            }else{
               result+=str.charAt(i);
            }
        }
        System.out.println("The result is " +result );

        sc.close();
    }
}
