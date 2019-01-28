package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ०९-०८-२०१७.
 */
public class SumOfArray {
    public int sumOfarr(int arr[],int index)
    {
        if(arr.length==index)
        {
            return 0;
        }

        return arr[index] + sumOfarr(arr,index+1);
    }
}
class ArrayUse
{
    public static void main(String[] args) {
        SumOfArray s1=new SumOfArray();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elemnts of the array:");
        for(int i=0;i<arr.length;i++) {
            arr[ i ] = s.nextInt();
        }


        int sum=s1.sumOfarr(arr,0);
        System.out.println("The sum of the array is :" + sum);


    }
}

