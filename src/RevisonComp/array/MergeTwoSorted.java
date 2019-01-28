package RevisonComp.array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        int m;
        int k=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        m=s.nextInt();
        int arr1[]=new int[m];

        for(i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int arr2[]=new int[m+n];

        for(i=0,j=0;i<arr.length&&j<arr1.length;){
            if(arr[i]<arr1[j]){
                arr2[k]=arr[i];
                k++;
                i++;
            }
            else if(arr[i]>arr1[j]){
                arr2[k]=arr1[j];
                k++;
                j++;
            }
        }
        while(i<arr.length){
            arr2[k]=arr[i];
            k++;
            i++;
        }
        while(j<arr1.length){
            arr2[k]=arr1[j];
            k++;
            j++;
        }
       for(i=0;i<arr2.length;i++){
           System.out.print(arr2[i]+" ");
       }
    }
}
