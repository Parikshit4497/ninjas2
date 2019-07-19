package RevisionCodingNinjas.Array1;

import java.util.Arrays;
import java.util.Scanner;

public class PairSumInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0,j=0,x=0 ;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        x=sc.nextInt();
        Arrays.sort(arr);
        for(i=0,j=arr.length-1;(i<=j);){

            if(arr[i]+arr[j]<x){
                i++;
            }else if(arr[i]+arr[j]>x){
                j--;
            }else{
                System.out.println(arr[i]+ " "+arr[j]);
                i++;
                j--;
            }
        }
        sc.close();
    }
}
