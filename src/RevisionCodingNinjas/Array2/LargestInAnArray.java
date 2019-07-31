package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class LargestInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,n=0;
        int max=0;

        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The max element is " +max);
        sc.close();

    }
}
