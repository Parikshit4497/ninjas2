package RevisionCodingNinjas.Recursion2;

import java.util.Scanner;

public class MergeSort {
    public static void  sortArray(int[] arr,int leftside,int rightside){

        if(leftside<rightside){
            int mid=(leftside+rightside)/2;
            sortArray(arr,leftside,mid);
            sortArray(arr,mid+1,rightside);
            merge(arr,leftside,mid,rightside);
        }

    }
    public static void merge(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[left + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[mid + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
     public static  void printArray(int arr[]){

        int i=0;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

     }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       printArray(arr);
       sortArray(arr,0,arr.length-1);
       sc.close();
    }
}
