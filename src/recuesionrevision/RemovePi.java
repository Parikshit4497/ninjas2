package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on १०-०८-२०१७.
 */
public class RemovePi {
 public String remove(String str1,String cas)
 {

     if(str1.length()==0)
     {
         return cas;
     }
     if(str1.charAt(0)=='p'&&str1.charAt(1)=='i')
     {
          cas=cas+"3.14";
          return remove(str1.substring(2),cas);
     }
     else {
         cas = cas + str1.charAt(0);
         return remove(str1.substring(1),cas);
     }

 }
}
class RemovePiUse
{
    public static void main(String[] args) {
        RemovePi r1= new RemovePi();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str1=s.next();
        String cas="";
        String str2= r1.remove(str1,cas);
        System.out.println("The  String is " + str2);
    }
}