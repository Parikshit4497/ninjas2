package CodzenArrayAssignment2;

import java.util.Scanner;

/**
 * Created by hp on २०-०६-२०१७.
 */
public class CheckArrayRotation {
    public static void main(String[] args) {
    int n ,i,k=0;

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements:");
    for(i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }

        k=arrayRotateCheck(arr);

     System.out.print("The number of places array has been rotated " +k);
    }


    public static int arrayRotateCheck(int[] arr){
        int i,k=0,n=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                k=i+1;
                n=++k;

            }
            else
            {
               break;
            }
        }

        return n ;
    }
}
