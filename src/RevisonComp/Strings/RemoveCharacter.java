package RevisonComp.Strings;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1="";
        String str2="";
        char ch=0;
        int i=0;
        str1=s.nextLine();
        ch=s.next().charAt(0);

        for(i=0;i<str1.length();i++){

            if(str1.charAt(i)!=ch){
                str2+=str1.charAt(i);
            }
        }
        System.out.println("The string after removing the character is " + str2);
    }
}
