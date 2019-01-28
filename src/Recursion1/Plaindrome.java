package Recursion1;


import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        String input="";
        boolean b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        input=s.nextLine();
        b=checkpalindrome(input);
        System.out.println("Is the string is plaindrome : " +b );
    }
    public static boolean checkpalindrome(String input)
    {

         boolean c;
         int flag[]=new int [input.length()-1];
         c=search(input,flag,0);
         return c;
    }
    public static boolean search( String input ,int flag[],int i)
    {
         int j=0;
         boolean b=false;
        if(input.length()==1)
        {
            return true;
        }
        if(i<input.length()/2)
        {
            if(input.charAt(i)==input.charAt(input.length()-i-1))
            {
                flag[i]=1;
                search(input,flag,i+1);
            }
            else
            {
                flag[i]=0;
            }

        }
        for(j=0;j<input.length()/2;j++) {
            if (flag[ j ] == 1) {
                b=true;
            } else {
                b=false;
            }
        }
        return b;
    }
}
