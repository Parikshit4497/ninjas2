package RevisionCodingNinjas.Strings2;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input="";
        char ch;
        String output="";
        int i=0,j=0;
        input=sc.nextLine();
      for(i=0;i<input.length()-1;){
       ch=input.charAt(i);
          if(input.charAt(i+1)==ch){
           i++;
          }else{
              output+=ch;
              i++;
          }
      }
      output+=input.charAt(input.length()-1);
        System.out.println(output);
        sc.close();
    }
}
