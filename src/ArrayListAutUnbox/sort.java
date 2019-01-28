package ArrayListAutUnbox;

import java.util.Scanner;

public class sort {

    private  static Scanner s1=new Scanner(System.in);
    public  static  int[]getIntegers(int arr[])
    {
         for (int j=0;j<arr.length;j++)
         {
             arr[j]=s1.nextInt();
         }
         return arr;
    }
    public static   void getSorted(int arr1[])
    {
        int temp=0,i,j;
        for(j=0;j<arr1.length;j++)
        {
            for(i=0;i<arr1.length-j-1;i++) {
                if (arr1[ i ] < arr1[ i + 1 ]) {
                    temp = arr1[ i ];
                    arr1[ i ] = arr1[ i + 1 ];
                    arr1[ i + 1 ] = temp;
                }
            }
        }

        printArray(arr1);
    }
    public static void printArray(int arr1[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the number of elements in the array:");
        int arr1[]=getIntegers(arr);
        System.out.println("The array after sorting is :");
        getSorted(arr1);


    }
}
