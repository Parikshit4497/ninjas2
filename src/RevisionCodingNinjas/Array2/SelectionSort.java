package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,index=0,min=0,temp;
        int n=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            index=i;
            min=arr[i];
            for(j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    index=j;
                }
                temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.println();
        }
        sc.close();
    }
}
