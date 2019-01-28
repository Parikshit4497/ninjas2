package RevisonComp.Strings;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input="";
        String str2="";
        char ch = 0;
        int i;
        input=s.next();
        for(i=0;i<input.length()-1;){
          ch=input.charAt(i);
          if(ch==input.charAt(i+1)){
              i++;
          }else {
              str2 += ch;
              i++;
          }
        }
        str2+=input.charAt(input.length()-1);
        System.out.println("remove teh duplicates " + str2 );
    }
}
