package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0,j=0,d,temp,k=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        d=sc.nextInt();

            while(k<d) {
                i=0;
                temp = arr[ i ];
                for (j = 0; j < arr.length - 1; j++) {
                    arr[ j ] = arr[ j + 1 ];
                }
                arr[ j ] = temp;
                k++;
            }


        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
