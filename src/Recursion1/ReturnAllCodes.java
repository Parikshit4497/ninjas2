package Recursion1;

import java.util.Scanner;

public class ReturnAllCodes {
    public static void main(String[] args) {
        String input;
        int i;
        String output[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num ");
        input = s.next();
        output = getcode(input);
        for (i = 0; i < output.length; i++) {
            System.out.println(output[ i ]);
        }


    }

    public static String[] getcode(String input)
    {
       int number =Integer.parseInt(input);
       return codes(number);
    }
    public static String[] codes(int number)
    {
        if(number==0)
        {
            String output[]={""};
            return output;
        }
        String smallAns1[]=codes(number/10);
        if((number%100)>9&&(number%100)<27)
        {
            String smaalAns2[]=codes(number/100);
            String output[]=merge(smallAns1,smaalAns2,number%100);
            return output;
        }
        String output[]=merge(smallAns1,number%10);
        return output;
    }
    public static String[] merge(String []smallAns1,String [] smallAns2,int number )
    {
        char current_number=(char)(number+96);
        String output[]=new String[smallAns1.length+smallAns2.length];
        for(int i=0;i<smallAns1.length;i++)
        {
            output[i]=smallAns1[i] +(char)(number%10+96);
        }
        for(int i=0;i<smallAns2.length;i++)
        {
            output[i+smallAns1.length]=smallAns2[i] +current_number;
        }
        return output;
    }
    public static String[] merge(String[] smallAns1,int number)
    {
        char current_number =(char)(number+96);
        String output[]=new String [smallAns1.length];
        for(int i=0;i<smallAns1.length;i++)
        {
            output[i]=smallAns1[i]+current_number;
        }
        return output ;
    }

}
