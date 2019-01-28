package RevisonComp.array;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int i,j,index=0,min=0;
        int n;
        int temp;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++){
            index=i;
            min=arr[i];
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    index=j;
                    min=arr[j];
                }
            }
            temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
