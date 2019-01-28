package Test;

import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by hp on १०-०७-२०१७.
 */
public class MaximiseProfit {
    public static void main(String[] args) {
        int N;
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        N=s.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter array elemnets :");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int result=MaxPro(arr);
        System.out.println("The maximum profit is "+ result );
    }
    public static int MaxPro(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int i=0,j;
        int a=0;
        int count=0;
        int m=0;
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++)
        {
            m=arr[i];
            count=0;
            for(j=i;j<arr.length;j++)
            {
                if(m<=arr[j])
                {
                    count++;
                }
            }
            if(max<m*count)
            {
                max=m*count;
            }
        }
        return max;
    }
}
