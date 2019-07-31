package RevisionCodingNinjas.String;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1="";
        String result="";
        String s="";
        String s1="";
        int i=0,j=0;
        str1=sc.nextLine();
        for(i=0;i<str1.length();i++){
            if(str1.length()!=' '){
                s+=str1.charAt(i);
            }
            if((str1.charAt(i)!=' ')||(i==str1.length()-1)){
                for(j=s.length()-1;j>=0;j--) {
                    s1 += s.charAt(j);

                    if ((j == 0) && (i !=str1.length() - 1)) {
                        s1 = s1 + " ";
                    }
                }
                s=(" ");
            }

        }
        System.out.println(s1);
        sc.close();
    }
}
