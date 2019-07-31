package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class DisplayAnArrray {
    public static void displayArray(int[] arr,int vidx ){
          if(vidx==arr.length){
              return;
          }
          System.out.print(arr[vidx]+" ");
          displayArray(arr,vidx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        displayArray(arr,0);
        sc.close();
    }
}
