package RevisonComp.Strings;

import java.util.Scanner;

public class ReplaceCharachters {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1="",str2="";
        int i;
        char ch,ch1 ;
        str1=s.nextLine();
        ch=s.next().charAt(0);
        ch1=s.next().charAt(0);
        for(i=0;i<str1.length();i++){
            if(str1.charAt(i)==ch){
                str2+=ch1;
            }else{
                str2+=str1.charAt(i);
            }
        }
        System.out.println("changed string " +str2);
    }
}
