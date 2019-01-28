package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on २९-०६-२०१७.
 */
public class BinarySearchRecusive {
    public static void main(String[] args) {
        int n,i;
        int m,h;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the elements of the array :");
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number you wish to serach:");
        m=s.nextInt();
     h=BinarySearch(arr,m);
     System.out.println("The elemnt is at index " + h);

    }
    public static int BinarySearch(int arr[],int m)
    {
        int lo=0,ans;
        int fo=0;
        int s=0;
        int n=0;
        lo=0;
        fo=arr.length-1;
        s=(fo+lo)/2;
      ans=Search(arr,fo,lo,n,m,s);
            return ans;
    }
    public static int Search(int arr[],int fo,int lo,int n,int m,int s)
    {
        if(arr.length==0)
        {
            return -1;
        }


        if(lo<fo)
        {

            if(arr[s]==m)
            {
               n=s;
               return n;
            }
            if(arr[s]<m)
            {
                lo=s+1;
                s=(fo+lo)/2;
               return Search( arr,fo,lo,n,m, s);
            }
            if(arr[s]>m)
            {
                fo=s-1;
                s=(fo+lo)/2;
                return Search(arr, fo, lo, n, m, s);
            }

        }
        if(lo>=fo)
        {
            return -1;
        }
        return n;
    }
}
