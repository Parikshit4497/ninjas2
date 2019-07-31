package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class SumOfNElemetsInAnArray {
    public static int sumOfArray(int[] arr,int vidx){
        if(vidx==arr.length){
            return 0;
        }
        int smallAns=sumOfArray(arr,vidx+1);
        int result=smallAns+arr[vidx];
        return  result;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println("The sum of digits in the array is" + sumOfArray(arr,0));
       sc.close();
    }
}
