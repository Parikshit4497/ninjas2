package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on ०५-०७-२०१७.
 */
public class ReturnSubsets {
    public static void main(String[] args) {
        int n;
        int arr2[][];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elemnts in the array:");
        n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        arr2=subsets(nums);
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static int[][] subsets(int input[]) {
        int ans[][]=sets(input,0);
        int i,j,k;
        int output[][]=new int[ans.length-1][];
        for( i=1,k=0;i<ans.length;i++,k++){
            output[k]=new int[ans[i].length-1];
            for( j=0;j<ans[i].length-1;j++)
            {
                output[k][j]=ans[i][j];
            }
        }
        return output;
    }
    public static int[][] sets(int input[],int index)
    {
        int i=0,k,j;
        if(index==input.length)
        {
            int ans[][]=new int[1][1];
            ans[0][0]=-1;
            return ans;
        }
        int smallAns[][]=sets(input,index+1);
        int ans[][]=new int [smallAns.length*2][];
        for( i=0;i<smallAns.length;i++)
        {
            ans[i]=new int[smallAns[i].length];
            for( j=0;j<smallAns[i].length;j++)
            {
                ans[i][j]=smallAns[i][j];

            }
        }
        for( i=0;i<smallAns.length;i++)
        {
            ans[smallAns.length+i]=new int[smallAns[i].length+1];
            for( j=0;j<=smallAns[i].length;j++)
            {
                if(j==0)
                {
                    ans[i+smallAns.length][j]=input[index];
                }
                else
                {
                    ans[i+smallAns.length][j]=smallAns[i][j-1];
                }
            }
        }
        return ans;
    }
}
