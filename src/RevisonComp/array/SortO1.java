package RevisonComp.array;

import java.util.ArrayList;
import java.util.Scanner;

public class SortO1 {
    public static void main(String[] args) {
        int n;
        int i;
        int j;
        int k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i =0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0,j=arr.length-1;i<=j;){
            if(arr[j]==1){
                j--;
            }
            else if(arr[i]==0){
                i++;
            }
            else if((arr[i]==1&&arr[j]==0)){
                k=arr[j];
                arr[j]=arr[i];
                arr[i]=k;
              i++;
              j--;
            }
        }

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
