package RevisionCodingNinjas.Strings2;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="";
        String s="";
        String input="";
        int i=0,j=0;
        input=sc.nextLine();
        for(i=0;i<input.length();i++){
            if(input.charAt(i)!=' '){
                s+=input.charAt(i);
            }else{
                for(j=0;j<s.length();j++){
                    s1+=s.charAt(s.length()-j-1);
                }
                s1=s1+ " ";
                s="";
            }
        }
        System.out.println(s1);
        sc.close();
    }
}
