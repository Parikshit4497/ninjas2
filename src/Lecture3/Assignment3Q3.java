package Lecture3;

/**
 * Created by hp on १४-०६-२०१७.
 */
import java.util.Scanner;
public class Assignment3Q3 {
    public static void main(String[] args) {
        int arr1[]=new int [20];
        int arr2[]=new int [20];
        int arr3[]=new int [20];
        int temp;
                ;
        int i,j;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the lements of tha array:");
        for(i=0;i<arr1.length;i++)
        {
            arr1[i]=input.nextInt();
        }
        j=arr2.length-1;
        for(i=0;i<arr1.length;i++)
        {
                temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                j--;
        }
        System.out.print("The reveresed array is:");
        for(j=0;j<arr2.length;j++)
        {
            System.out.println(arr2[j]);
        }
    }
}
