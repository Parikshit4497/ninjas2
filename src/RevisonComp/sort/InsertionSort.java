package RevisonComp.sort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        int temp;
        int index;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++){
            j=i-1;
            temp=arr[i];
           while(j>=0&&temp<arr[j]){
             arr[j+1]=arr[j];
             j=j-1;
           }
           arr[j+1]=temp;
        }
    }
}
