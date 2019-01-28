package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class ReplaceCharachter {
   public String ChangedString(String str,char ch,char ch1,String cas)
   {
       if(str.length()==0)
       {
           return cas;
       }
       if(str.charAt(0)==ch)
       {
          cas=cas+ch1;
          return ChangedString(str.substring(1),ch,ch1,cas);
       }
       else
       {
           cas=cas+str.charAt(0);
           return ChangedString(str.substring(1),ch,ch1,cas);
       }
   }
}
class ReplaceCharUse
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ReplaceCharachter r1=new ReplaceCharachter();
        System.out.println("Enter the string :");
        String str=s.next();
        System.out.println("Enter the charachter which you wish to replace: ");
        char ch=s.next().charAt(0);
        System.out.println("Enter the charachter you wish to replace it with: ");
        char ch1=s.next().charAt(0);
        String cas="";
        System.out.println("The string after replacing charachter is:" +  r1.ChangedString(str,ch,ch1,cas));

    }
}