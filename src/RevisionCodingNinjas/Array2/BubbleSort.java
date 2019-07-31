package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,n=0,temp;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    temp = arr[ j ];
                    arr[ j ] = arr[ j + 1 ];
                    arr[ j+1 ] = temp;
                }
            }
        }
          for(i=0;i<arr.length;i++){
              System.out.print(arr[i]+ " ");
          }

        sc.close();
    }
}
