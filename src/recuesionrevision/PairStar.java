package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class PairStar {
    public String changedString(String str1,String cas)
    {
        if(str1.length()==0)
        {
            return cas+str1.substring(str1.length()-1);
        }
        if(str1.length()>=2) {
            if (str1.charAt(0) == str1.charAt(1)) {
                cas = cas + str1.charAt(0) + "*" ;
                return changedString(str1.substring(1), cas);
            } else {
                cas = cas + str1.charAt(0);
                return changedString(str1.substring(1), cas);
            }
        }
        return cas+str1.substring(str1.length()-1);
    }


}
class pairStarUse
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        PairStar p1=new PairStar();
        System.out.println("Enter the string: ");
        String str1=s.next();
        String cas="";
        String result = p1.changedString(str1,cas);
        System.out.println("The changed string is:" + result);

    }
}