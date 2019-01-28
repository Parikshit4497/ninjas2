package RevisonComp.Recursion;

import java.util.Scanner;

public class RemoveX {
    public static String StringRemoveX(String string1,String string2){

        if(string1.length()==0){
            return string2;
        }
           if(string1.charAt(0)!='x'){
               string2+=string1.charAt(0);
               return StringRemoveX(string1.substring(1),string2);
           }else{
               return StringRemoveX(string1.substring(1),string2);
        }


   }
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String string1=s.next();
     String string2="";
     System.out.println("The string after removing x " + StringRemoveX(string1,string2));
    }
}
