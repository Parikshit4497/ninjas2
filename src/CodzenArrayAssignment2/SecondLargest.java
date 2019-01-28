package CodzenArrayAssignment2;

/**
 * Created by hp on २०-०६-२०१७.
 */
import java.util.Scanner;
import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int n, i,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        n = input.nextInt();
        int arr[] = new int[ n ];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            arr[ i ] = input.nextInt();
        }
        Arrays.sort(arr);
        j=secondLargestElement(arr);
                System.out.println("The second largest element in the array is " +arr[j]);
    }
        public static int secondLargestElement(int[] arr) {
            int i,n=0;

            for(i=arr.length-1;i>=0;i--)
            {

                if(arr[i-1]<arr[i])
                {
                    n=arr[i-1];
                    break;
                }
            }
            return n;
    }
}

