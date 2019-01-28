package RevisonComp.ArrayRe;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int i;
        int j;
        int temp;
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[ n ];
        for (i = 0; i < arr.length; i++) {
            arr[ i ] = s.nextInt();
        }
//        for(j=0;j<arr.length;j++){
//            for(i=0;i<arr.length-i-1;i++){
//                 temp=arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=temp;
//            }
//        }

        for (i = 1; i < arr.length; i++) {

            if (arr[ i ] < arr[ i - 1 ]) {
                arr[ i ] = arr[ i ] + arr[ i - 1 ];
                arr[ i - 1 ] = arr[ i ] - arr[ i - 1 ];
                arr[ i ] = arr[ i ] - arr[ i - 1 ];
                i = 0;
            }


        }
        for (i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
