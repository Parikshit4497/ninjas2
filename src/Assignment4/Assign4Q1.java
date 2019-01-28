package Assignment4;

/**
 * Created by hp on १४-०६-२०१७.
 */
import java.util.Scanner;
public class Assign4Q1 {
    public static void main(String[] args) {
        int n,m,i,j ,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the number of elements in teh array ;");
        m=input.nextInt();
        System.out.println("Enter the elements in the array:");
        for(i=0;i<m;i++)
        {
            arr[i]=input.nextInt();
        }
        for(i=0;i<m;i++) {
            temp=arr[i];
            j=i-1;
            while(j>=0&&temp<arr[j])
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        System.out.println("The array after sorting");
        for(i=0;i<m;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
