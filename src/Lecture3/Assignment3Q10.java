package Lecture3;

/**
 * Created by hp on १४-०६-२०१७.
 */
import java.util.Scanner;
public class Assignment3Q10 {
    public static void main(String[] args) {
        int n,i,j,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the number of elements in the array:");
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(j=0;j<n;j++) {
            for (i = 0; i < n - j - 1; i++) {
                if (arr[ i ] > arr[ i + 1 ]) {
                    temp = arr[ i + 1 ];
                    arr[ i + 1 ] = arr[ i ];
                    arr[ i ] = temp;
                }
            }
        }
        System.out.println("The array after sorting is:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }

    }
}
