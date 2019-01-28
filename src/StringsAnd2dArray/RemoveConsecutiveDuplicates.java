package StringsAnd2dArray;


import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String input="",str="";
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        input=s.next();
       str=removeConsecutiveDuplicates(input);
       System.out.println("The  string after removing duplicate is:" +str);
    }
    public static String removeConsecutiveDuplicates(String input) {
        String str="";
        int i,j;

        for(i=0;i<input.length()-1;i++)
        {
            if(input.charAt(i)!=input.charAt(i+1))
            {
                str+=input.charAt(i);
            }
            else
            {
                continue;
            }
        }
        str=str+input.charAt(input.length()-1);
        return str;
    }
}
