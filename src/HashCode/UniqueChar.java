package HashCode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by hp on ०४-०८-२०१७.
 */
public class UniqueChar {
    public static String findUnique(String str1,HashMap<Character,Integer> hm)
    {
        String str2="";
        for(int i=0;i<str1.length();i++)
        {
            if(hm.containsKey(str1.charAt(i)))
            {
                hm.put(str1.charAt(i),hm.get(str1.charAt(i))+1);
                continue;
            }
            else
            {
                hm.put(str1.charAt(i),1);
                str2=str2+str1.charAt(i);
            }
        }
        return str2;
    }
}

class UniqueCharUse
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        UniqueChar u1=new UniqueChar();
        HashMap<Character,Integer> hm =new HashMap <>();
        String str1="";
        System.out.println("Enter the string ");
        str1=s.nextLine();
        String str2 =u1.findUnique(str1,hm);
        System.out.println("The string after removing duplicate character is " + str2);
    }
}
