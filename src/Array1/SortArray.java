package Array1;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i=0,j=0,temp=0;
        n=s.nextInt();
        int[] arr=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0,j=arr.length-1;i<=j;){
            if(arr[i]==1&&arr[j]==0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if(arr[i]==0){
                i++;
            }else if(arr[j]==1){
                j--;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}
