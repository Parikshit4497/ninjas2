package RevisonComp.array;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        int n;
        int i;
        int j = 0;
        int k = 0;
        int nextZero = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array size");
        n = s.nextInt();
        int arr[] = new int[ n ];
        int nextTwo = arr.length - 1;

        System.out.println("Enter the array elements ");
        for (i = 0; i < arr.length; i++) {
            arr[ i ] = s.nextInt();
        }
//        for(i=0;i<arr.length;i++){
//
//            if(arr[i]==0){
//                arr1[j]=arr[i];
//                j++;
//            }else if(arr[i]==2){
//                k++;
//
//                arr1[arr1.length-k]=arr[i];
//
//            }
//
//        }
//        while(j<arr1.length-k){
//            arr1[j]=1;
//            j++;
//        }
//        for(i=0;i<arr1.length;i++){
//            System.out.print(" " + arr1[i]);
//        }
        i = 0;
        while (i <= nextTwo){
            if (arr[ i ] == 0) {
                int temp = arr[ nextZero ];
                arr[ nextZero ] = arr[ i ];
                arr[ i ] = temp;
                nextZero++;
                i++;
            } else if (arr[ i ] == 2) {
                int temp = arr[ nextTwo ];
                arr[ nextTwo ] = arr[ i ];
                arr[ i ] = temp;
                nextTwo--;

            } else {
                i++;
            }
    }

        for(i=0;i <arr.length;i++)

    {
        System.out.print(" " + arr[ i ]);
    }
}
    }

