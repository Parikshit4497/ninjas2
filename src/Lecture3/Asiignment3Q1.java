package Lecture3;

/**
 * Created by hp on १४-०६-२०१७.
 */
import java.util.Scanner;
public  class Asiignment3Q1 {
    public static void main(String[] args) {
        int arr1[]=new int [30];
        int num ,sum=0,base=1,i=0,j=0;
        int arr2[]=new int [30];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the decimalnumber whichyou wish to cconvert in binary :");
        num=input.nextInt();
        while(num>0)
        {
            arr1[i]=num%2;
            num=num/2;
            sum=sum +arr1[i]*base;
            base=base*10;
        }
        System.out.println(sum);

    }


}
