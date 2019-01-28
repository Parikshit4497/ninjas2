package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class RemoveDuplicates {
    public String remove(String str,String cas)
    {
        if(str.length()==0)
        {
            return cas +str.charAt(str.length()-1);
        }
        if(str.length()>=2) {
            if (str.charAt(0) != str.charAt(1)) {
                cas = cas + str.charAt(0);
                return remove(str.substring(1), cas);
            } else {
                return remove(str.substring(1), cas);
            }
        }
 return cas + str.charAt(str.length()-1);
    }
}
class duplicates
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        RemoveDuplicates  r1= new RemoveDuplicates();
        System.out.println("Enter the string: ");
        String str=s.next();
        String cas="";
        System.out.println("The string after removing duplicates is: " + r1.remove(str,cas));
    }
}