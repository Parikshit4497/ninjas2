package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on ०२-०७-२०१७.
 */
public class PrintSubsetofanArray {
    public static void main(String[] args) {
         int n;

         Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elemnts in the array:");
        n=s.nextInt();
        int nums[]=new int[n];
         for(int i=0;i<n;i++)
         {
             nums[i]=s.nextInt();
         }
         PrintSubSet(nums);
    }
    public static void PrintSubSet(int nums[])
    {
        for(int i=0;i<=nums.length;i++)
        {
            boolean[] ifprint=new boolean[nums.length];
            PrintSubSet(nums,ifprint,0,i);
        }
    }
    public static void PrintSubSet(int nums[],boolean[] ifprint,int start, int remain)
    {
        if(remain==0)
        {
            System.out.print("{");
            for(int i=0;i<ifprint.length;i++)
            {
                if(ifprint[i])
                    System.out.print(nums[i]+" ");
            }
            System.out.print("}\n");
        }
        else
        {
            if(start+remain>nums.length)
                ;
            else {
                for (int i = start; i < ifprint.length; i++) {
                    if (!ifprint[ i ]) {
                        ifprint[ i ] = true;
                        PrintSubSet(nums, ifprint, i + 1, remain - 1);
                        ifprint[i]=false;
                    }
                }
            }
        }
    }
}
