package RevisonComp.Recursion;

import java.util.Scanner;

public class StringToIntger {
    public static  int stringToInt(String string1,int index,int num){

        if(index==string1.length()){
            return num;
        }else{
            num=num*10+Character.getNumericValue(string1.charAt(index));
            return stringToInt(string1,index+1,num);
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string1=s.next();
        int num=0;
        System.out.println("The string after converting to corresponding integer value is " +stringToInt(string1, 0,num) );
    }
}
