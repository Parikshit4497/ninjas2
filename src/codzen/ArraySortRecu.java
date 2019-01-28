package codzen;

import java.util.Scanner;

/**
 * Created by hp on २०-०६-२०१७.
 */
public class ArraySortRecu{
    public static void main(String[] args) {
        int n,i ;
        boolean b=false;
        Scanner s=new Scanner(System.in);
        System.out.println("Array size");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements ");
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        b=ArraSearch(arr);
        System.out.println("Isthe array sorted:"+ b);
    }
    public static boolean ArraSearch(int [] arr)
    {
        boolean c=false;
        if(arr.length==1||arr.length==0)
        {
            return true;
        }
        if(arr[0]>arr[1])
        {
            return false;
        }
        int[] smallArray=new int[arr.length-1];

        for(int i=0;i<smallArray.length;i++)
        {
            smallArray[i]=arr[i+1];
        }
       return ArraSearch(smallArray);

    }

}
