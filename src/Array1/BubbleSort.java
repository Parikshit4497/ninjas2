package Array1;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr;
        int i=0,j=0;
        int temp=0;
        int n=0;
        n=s.nextInt();
        arr=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
