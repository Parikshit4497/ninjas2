package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on ०४-०७-२०१७.
 */
public class TimeQuickSort {
    public static void main(String[] args) {
        int n, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        n = s.nextInt();
        int arr[] = new int[ n ];
        System.out.println("Enter thhe elemnets of the  array:");
        for (i = 0; i < n; i++) {
            arr[ i ] = s.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;
        quickSort(arr, start, end);
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[ i ] + " ");
        }
    }
      public static void quickSort(int arr[],int start,int end) {
          if (start >= end) {
              return;}
          if(start<end) {
              int position = getPosition(arr, start, end);
              quickSort(arr, start, position - 1);
              quickSort(arr, position + 1, end);}}
        public static int getPosition(int[] arr,int start,int end)
        {   int max=0;
            int temp=0,temp1=0;
            int count=start,j,i=0,k=end;
                max=arr[start];
                for(j=start+1;j<=end;j++) {
                    if (max >= arr[ j ]) {
                        count++;}}
                temp=arr[count];
                arr[count]=max;
                arr[start]=temp;
                while(i<=count&&k>=count)
                {   if(arr[i]<=max)
                    { i++;}
                    else  if(arr[k]>max)
                    {k--;}
                    else
                    {   temp1=arr[i];
                        arr[i]=arr[k];
                        arr[k]=temp1;
                   i++;
                        k--;}}
                return count;
        }
}

