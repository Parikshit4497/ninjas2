package Array1;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int temp=0;
        int i=0,j=0;
        int  n=0;
        int[] arr;
        int min=0;
                n=s.nextInt();
        arr =new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int index=0;
        for(i=0;i<arr.length;i++){
            min=arr[i];
            index=i;
            for(j=i+1;j<arr.length;j++){
                   if(min>arr[j]){
                      min=arr[j];
                      index=j;
                   }
            }
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
    }
}
