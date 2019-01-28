package RevisonComp.array;

import java.util.Arrays;
import java.util.Scanner;

public class findUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, j;
        int sum = 0;
        int sum1 = 0;
        System.out.println("Enter the number of elements in the array");
        n = scanner.nextInt();
        int arr[] = new int[ n ];
        System.out.println("Enter the elements of the array");

        for (i = 0; i < arr.length; i++) {
            arr[ i ] = scanner.nextInt();
        }
        Arrays.sort(arr);
   /*     for(i =0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        for(i=0;i<arr.length-1;i++){
            sum1=sum1+arr[i] ;
        }

        System.out.println("The unique number is:" +(sum-sum1));
        */
        for (i = 0, j = i+1;i<arr.length-1&&j<arr.length; ) {
              if(arr[i]==arr[j]){


                  i=i+2;
                  j=i+1;
                  continue;
              }else{
                  break;
              }

        }
        System.out.println(arr[i]);
    }
}