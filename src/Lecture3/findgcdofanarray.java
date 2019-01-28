package Lecture3;

import java.util.Scanner;

/**
 * Created by hp on १९-०७-२०१७.
 */
public class findgcdofanarray {
    private int gcd(int arr[])
    {
        int smallest=arr[0];
        int count;
        for(int j=0;j<arr.length;j++)
        {
            if(smallest>arr[j])
            {
                smallest=arr[j];
            }
        }
        int temp=0;
        while(smallest>1)
        {
            count=0;
            while(count<arr.length)
            {
                temp+=arr[count]%smallest;
                count++;
            }
            if(temp==0)
            {
                return smallest;
            }
            smallest--;
        }
        return -1;
    }

    public static void main(String[] args) {
        findgcdofanarray g1 =new findgcdofanarray();
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int m= g1.gcd(arr);
        System.out.println("The greatest commmon divisor is:" + m);

    }

}
