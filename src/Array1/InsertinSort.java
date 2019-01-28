package Array1;

import java.util.Scanner;

public class InsertinSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr ;
        int n=0,i=0,j=0;
        int temp=0;
        n=s.nextInt();
        arr=new int[n];
        for(i=0;i<arr.length;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0&&temp>arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
