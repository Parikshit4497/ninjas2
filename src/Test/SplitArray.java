/**package Test;

import java.util.Scanner;

/**
 * Created by hp on १०-०७-२०१७.

public class SplitArray {
    public static void main(String[] args) {


        int N;
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        N = s.nextInt();
        int arr[] = new int[ N ];
        System.out.println("Enter array elemnets :");
        for (i = 0; i < arr.length; i++) {
            arr[ i ] = s.nextInt();
        }
        boolean result = SplitArray(arr);
        System.out.println("The answer is " + result);
    }
    public static boolean SplitArray(int arr[])
    {
        int k=0;
        int i=0;
        int j;
        int arr1[]=new int[arr.length];
        int sum1=0;
        int sum2=0;
        for(i=0;i<arr.length;i++)
        {
            if(((arr[i])%3)==0)
            {
                arr1[k++]=arr[i];
            }

        }
        for(i=0;i<arr.length;i++)
        {
            if(((arr[i]%5)==0))
            {
                arr1[k++]=arr[i];
            }
        }
        for(i=0;i<arr.length;i++) {
            if (arr[ i ] % 5 != 0 && arr[ i ] % 3 != 0) {
                arr1[ k++ ] = arr[ i ];
            }
        }

        sum1=arr1[0];
        sum2=arr1[arr.length-1];
        for(i=1,j=arr1.length-2;i<arr.length-1&&j>0;) {
               sum1;
               sum2;
            if (sum1 < sum2) {
                sum1=sum1+arr[i];
                i++;
            } else if (sum1 > sum2)
            {
                sum2=sum2+arr[j];
                j--;
            }
            if (sum1 == sum2 && (i == j)) {
                return true;
            }

        }


        return false;
    }
}
*/