package RevisonComp.ArrayRe;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int i,j,n,temp;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
