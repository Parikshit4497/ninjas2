package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class AllIndexOfNumber {
    public  static  int[] printAllIndexes(int[] arr,int data,int vidx,int coef){
        if(arr.length==vidx){
            return  new int[coef];
        }
        int result[];
        if(arr[vidx]==data){
            result=printAllIndexes(arr,data,vidx+1,coef+1);
            result[coef]=vidx;
        }else{
            result=printAllIndexes(arr,data,vidx+1,coef);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[];
        int data=sc.nextInt();
        arr1=printAllIndexes(arr,data,0,0);
                for(int j=0;j<arr1.length;j++){
                    System.out.print(arr1[j] + " ");
                }
        sc.close();
    }
}
