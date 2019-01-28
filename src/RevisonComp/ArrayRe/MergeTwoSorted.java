package RevisonComp.ArrayRe;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int n;
        int m,i,j,k=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr1[]=new int[n];
        for(i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        m=s.nextInt();
        int arr2[]=new int[m];
        for(i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
        }
        int arr3[]=new int[m+n];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(i=0,j=0;i<arr1.length&&j<arr2.length;){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }else if(arr2[j]<=arr1[i]){
                arr3[k]=arr2[j];
                k++;
                j++;

            }
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
        }
        for(i=0;i<arr3.length;i++){
            System.out.print( arr3[i]+ " ");
        }
    }
}
