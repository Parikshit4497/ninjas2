package RevisionCodingNinjas.Array2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,n,m,k=0;
        n=sc.nextInt();
        int arr1[]=new int[n];
        for(i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        m=sc.nextInt();
        int arr2[]=new int[m];
        for(i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int result[]=new int[arr1.length+arr2.length];
        for(i=0,j=0;i<arr1.length&&j<arr2.length;){

            if(arr1[i]<arr2[j]){
                result[k++]=arr1[i++];
            }else if(arr2[j]<arr1[i]){
                result[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            result[k++]=arr1[i++];
        }
        while(j<arr2.length){
            result[k++]=arr2[j++];
        }
        for(i=0;i<result.length;i++) {
            System.out.print(result[i] +" ");
        }
        sc.close();
    }
}
