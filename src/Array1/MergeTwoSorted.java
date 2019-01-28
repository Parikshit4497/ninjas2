package Array1;

import java.util.Scanner;

public class MergeTwoSorted {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr1,arr2,result;
        int n=0,m=0,k=0;
        int i=0,j=0;
        n=s.nextInt();
        arr1=new int[n];

        for(i=0;i< arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        m=s.nextInt();
        arr2=new int[m];
        for(i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
        }
         result=new int[arr1.length+arr2.length];

        for(i=0,j=0;i<arr1.length&&j<arr2.length;){
             if(arr1[i]<=arr2[j]){
                 result[k++]=arr1[i];
                 i++;
             }else if(arr2[j]<=arr1[i]){
                 result[k++]=arr2[j];
                 j++;
             }
        }

        while(i<arr1.length){
            result[k++]=arr1[i];
            i++;
        }
        while(j<arr2.length){
            result[k++]=arr2[j];
            j++;
        }
        for(i=0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
    }
}
