package Assignment4;

/**
 * Created by hp on १५-०६-२०१७.
 */
import java.util.Scanner;
public class QselectionSort {
    public static void main(String[] args) {
        int n,size,i,min=Integer.MAX_VALUE,j,temp,index=-1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of th array :");
        size=input.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the number of elemnts in the array:");
        n=input.nextInt();
        System.out.println("enter the elemnts in tha array:");
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(i=0;i<n;i++) {
            index=i;
            min=arr[i];

            for (j = i+1; j < n; j++) {
                if (min > arr[ j ]) {
                    min = arr[ j ];
                    index = j;

                }
            }
            temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }

        System.out.println("The array after sorting is:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }

    }
}
