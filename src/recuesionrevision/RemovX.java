package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on १०-०८-२०१७.
 */
public class RemovX {
    public String removeX(String str1,String cas)
    {
        if(str1.length()==0)
        {
            return cas;
        }
        if(str1.charAt(0)=='x'||str1.charAt(0)=='X')
        {
            return removeX(str1.substring(1),cas);
        }
        else
        {
            cas=cas+str1.charAt(0);
            return removeX(str1.substring(1),cas);
        }

    }
}
class RemoveXuse
{
    public static void main(String[] args) {
        RemovX r1=new RemovX();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1=s.next();
        String cas="";
        String result= r1.removeX(str1,cas);
        System.out.println("The resultant string is :" + result);
    }
}