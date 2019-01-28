package Lecture3;

/**
 * Created by hp on १३-०६-२०१७.
 */
import java.util.Scanner;
public class ArrayMaxMin {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int n, max1=0;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Select option 1 to fill array\n" );
        n = input.nextInt();
        switch (n){
            case 1:
              max1=fillarr(arr);
                break;
        }
        System.out.println("The maximum element in the array :" + max1);
    }


public static int fillarr(int[] arr){
        {
        Scanner innum= new Scanner(System.in);
        System.out.println("Enter the elements of the array :\n");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=innum.nextInt();
        }
        maxarr(arr);
        return maxarr(arr);
    }
}
public static int maxarr(int arr[])
{
    int i ,max=Integer.MIN_VALUE;
    for(i=0;i<arr.length;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    return max ;
}
}