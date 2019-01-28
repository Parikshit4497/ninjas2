package RevisonComp.ArrayRe;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        int i ,j;
        int x,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        x=s.nextInt();
        for(i=0,j=arr.length-1;i<=j;){
            if(arr[i]+arr[j]==x){
                System.out.println(arr[i] + " " +arr[j]);
                i++;
                j--;
                continue;
            }else if(arr[i]+arr[j]<x){
                i++;
            }else if(arr[j]+arr[i]>x){
                j--;
            }
        }
    }
}
