package Recursion1;

/**
 * Created by hp on ०५-०७-२०१७.
 */

import java.util.Scanner;
public class ReturnSubsetSumEqualTok {
    public static void main(String[] args) {


        int n;
        int arr2[][];
        int sum=0,k=0,num1,d,count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elemnts in the array:");
        n = s.nextInt();
        int nums[] = new int[ n ];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            nums[ i ] = s.nextInt();
        }
        System.out.println("enter the value of k");
        num1=s.nextInt();
        arr2 = subsets(nums);
        int  pos[]=new int [arr2.length];
        for(int i=0;i<arr2.length;i++)
        {   sum=0;
            for(int j=0;j<arr2[i].length;j++)
            {
                sum=sum+arr2[i][j];
            }
            if(sum==num1)
            {
                pos[k++]=i;
            }
            count=k;
        }
        int arr3[][]=new int[n][];
        for( d=0;d<count;d++)
        {
            arr3[d]=new int[arr2[pos[d]].length];
            for(int j=0;j<arr2[pos[d]].length;j++)
            {
                arr3[d][j]=arr2[pos[d]][j];
            }
        }
        for(int i=0;i<count;i++)
        {
            for(int j=0;j<arr2[pos[i]].length;j++)
            {
                System.out.print(arr3[i][j]+" ");
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
