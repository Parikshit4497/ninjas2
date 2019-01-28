package RevisonComp.Strings;

import java.util.Scanner;

public class ReverseEachWord2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1="";
        String s2="";
        String s3="";
        s1=s.nextLine();
        int i,j;
        for(i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                s2+=s1.charAt(i);
            }
            if((s1.charAt(i)==' ')||(i==s1.length()-1)) {
                for (j = s2.length() - 1; j >= 0; j--) {
                    s3 += s2.charAt(j);

                    if ((j == 0) && i != (s1.length() - 1)) {
                        s3 = s3 + " ";
                    }
                }

                s2 = "";
            }
        }
        System.out.println("The reversed string is " + s3);
    }
}
