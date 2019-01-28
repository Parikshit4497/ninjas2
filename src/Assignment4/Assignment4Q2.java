package Assignment4;

/**
 * Created by hp on १५-०६-२०१७.
 */
import java.util.Scanner;
public class Assignment4Q2 {
    public static void main(String[] args) {
        int n,key,m,i,j;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n=input.nextInt();
        System.out.println("Enter the number of elements in the array :");
        m=input.nextInt();
        int arr1[]=new int [n];
        int arr2[]=new int [n];
        System.out.println("Enter the number of elements in array1");
        for(i=0;i<m;i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("Enter the number of elements in second array:");
        for(i=0;i<m;i++)
        {
            arr2[i]=input.nextInt();
        }
        for(j=0;j<m;j++) {
            key=arr1[j];
            for (i = 0; i < m; i++) {
                if (key==arr2[ i ]) {
                    System.out.println("The intersection of two arrays is:" + key);
                }
            }
        }
    }
}
