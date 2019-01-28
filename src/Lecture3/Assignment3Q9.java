package Lecture3;

/**
 * Created by hp on १४-०६-२०१७.
 */
import java.util.Scanner;
public class Assignment3Q9 {
    public static void main(String[] args) {
        int n,i,temp=0,j;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        n=input.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the digits of the binary number in the array ");
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();

        }
        for(j=0;j<n;j++) {
            for (i = 0; i < n-j-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("The array after sorting is :");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
