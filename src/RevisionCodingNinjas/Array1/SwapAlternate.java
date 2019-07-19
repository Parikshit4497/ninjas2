package RevisionCodingNinjas.Array1;

import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,n=0,temp=0;
        int arr[];
        n=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(arr.length%2==0){
            for(i=0;i<arr.length;i=i+2){
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }else{
            for(i=0;i<arr.length-1;i=i+2){
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
