package Stack;

import java.util.Scanner;

/**
 * Created by hp on ०१-०८-२०१७.
 */
public class StockSpan {
    public static int[] Result(int arr[])
    {
        int data=0;
        int j,i,k=0;
        int count=0;
        int arr3[] = arr.clone();
        int arr2[]=new int[arr.length];
          for( i=0,j=0;j<arr.length;) {
            data=arr3[j];
            if(i<=j) {
                if (data > arr[ i ]) {
                    count++;
                    i++;
                    continue;
                }
             else  if(i==j&&data==arr[i])
                {
                    i++;
                    count++;
                    continue;
                }
                else
                {
                    count=0;
                }
               i++;
            }
            else
            {   arr2[k++] = count;
                i=0;
                j++;
                count = 0;
                continue;
            }

        }




        return arr2;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StockSpan s1 =new StockSpan();
        System.out.println("Enter the number of elements in the array");
        int n=s.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter  elememnts in the array ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
       int arr1[]= s1.Result(arr);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] +" ");
        }
    }
}
