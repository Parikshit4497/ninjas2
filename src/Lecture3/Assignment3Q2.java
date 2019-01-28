package Lecture3;

/**
 * Created by hp on १४-०६-२०१७.
 */
import java.util.Scanner;
public class Assignment3Q2 {
    public static void main(String[] args) {
        long arr1[]=new long[20];
        long prod=1,i;
        Scanner input=new Scanner(System.in) ;
        System.out.println("Enter the number in the array :");
        for(i=0;i<arr1.length;i++)
        {
            arr1[(int) i]=input.nextLong();

        }
        for(i=0;i<arr1.length;i++)
        {
            prod=prod*arr1[(int) i];
        }
        System.out.println("The product of the elements in the array is :"+ prod);
    }
}
