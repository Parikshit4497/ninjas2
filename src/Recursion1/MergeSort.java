package Recursion1;

import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args) {
        int n, i, j;
        int arr1[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elelmnets in teh array:");
        n = s.nextInt();
        int input[] = new int[ n ];
        System.out.println("Enter the elements of the array ");
        for (i = 0; i < n; i++) {
            input[ i ] = s.nextInt();
        }
       arr1=mergeSort(input);
        for(i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]);
        }
    }
    public static  int[] mergeSort(int[] input){

        int low=0;
        int high=input.length-1;
        int arr2[];
        arr2=sort(input,low,high);
        return arr2;
    }
    public static int []sort(int[] input, int low, int high)
    {
        int N = high - low;
        if (N <=1)
            return input;

        int mid = low + N/2;
        // recursively sort
        sort(input, low, mid);
        sort(input, mid, high);
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++)
        {
            if (i == mid)
                temp[k] = input[j++];
            else if (j == high)
                temp[k] = input[i++];
            else if (input[j]<input[i])
                temp[k] = input[j++];
            else
                temp[k] = input[i++];
        }
        for (int k = 0; k < N; k++)
            input[low + k] = temp[k];
        return input;
    }

}