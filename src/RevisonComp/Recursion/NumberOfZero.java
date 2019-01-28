package RevisonComp.Recursion;

import java.util.Scanner;

public class NumberOfZero {
    public static  int TheNumOfZeroesis(int m,int count){

        if(m==0){
            return count;
        }
        if(m%10==0){
            count=TheNumOfZeroesis(m/10,count+1);
        }else{
         count=TheNumOfZeroesis(m/10,count);
        }
//        if(m%10==0) {
//            return TheNumOfZeroesis(m / 10)+1;
//        }else{
//          return   TheNumOfZeroesis(m/10);
//        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();

        int result=TheNumOfZeroesis(m,0);
        System.out.println("the number of zeroes in the number is " +result);
    }
}
