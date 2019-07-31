package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,j=0,i=0,temp;
        n=sc.nextInt();
        int arr[]=new int[n];

        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
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
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}
