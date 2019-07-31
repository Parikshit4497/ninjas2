package RevisionCodingNinjas.String;

import java.util.Scanner;

public class SubstringsOfAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input="";
        String result="";
        int i=0,j=0;
        input=sc.nextLine();

        for(i=0;i<input.length();i++){
            result+=input.charAt(i);
            for(j=i+1;j<input.length();j++){
                System.out.println(result);
                result+=input.charAt(j);

            }System.out.println(result);
            result="";
        }

        sc.close();
    }
}
