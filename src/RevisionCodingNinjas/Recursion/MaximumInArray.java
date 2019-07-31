package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class MaximumInArray {
    public static int maxArray(int[] arr,int vidx){
        if(vidx==arr.length-1){
           return  arr[vidx];
        }
        int misa=maxArray(arr,vidx+1);
        if(misa>arr[vidx]){
            return misa;
        }else{
            return arr[vidx];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("The maximum array is " + maxArray(arr,0));
        sc.close();
    }
}
