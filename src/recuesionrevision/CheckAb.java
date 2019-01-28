package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class CheckAb {
    public boolean checkab(String str)
    {
        if(str.length()==0)
        {
            return true;
        }
        if(str.charAt(0)=='a')
        {
            if(str.length()==1)
            {
                return true;
            }
            else if(str.length()>2&&str.substring(1,3).equals("bb"))
            {
                return checkab(str.substring(3));
            }
            else if(str.charAt(1)=='a')
            {
                return  checkab((str.substring(1)));
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }

    }
}
class AbUse
{
    public static void main(String[] args) {
        CheckAb c1= new CheckAb();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=s.next();

        System.out.println("Does the string follow the specified rule: " + c1.checkab(str) );
    }
}