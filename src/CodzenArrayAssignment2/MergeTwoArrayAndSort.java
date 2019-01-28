package CodzenArrayAssignment2;

/**
 * Created by hp on १७-०६-२०१७.
 */
import java.util.Scanner;
public class MergeTwoArrayAndSort {
    public static void main(String[] args) {
        int n,i,j,m,temp,k=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the first array :");
        n=input.nextInt();
        System.out.println("Enter the size of the second array :");
        m=input.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int arr[]=new int[arr1.length +arr2.length];
        System.out.println("Enter elements of first array:");
        for(i=0;i<n;i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("Enter the elements of second array :");
        for(j=0;j<m;j++)
        {
            arr2[j]=input.nextInt();
        }
        k=0;
        for(i=0;i<arr1.length;i++)
        {
          arr[k]=arr1[i];
          k++;
        }
        for(j=0;j<arr2.length;j++)
        {
            arr[k]=arr2[j];
            k++;
        }
        for(i=0;i<arr1.length+arr2.length;i++)
        {
            for(j=0;j<arr1.length+arr2.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<arr1.length+arr2.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
