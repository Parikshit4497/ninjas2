package Lecture3;

/**
 * Created by hp on १४-०६-२०१७.
 */
import java.util.Scanner;
public class Assignment3Q8 {
    public static void main(String[] args) {
        int n ,i,sum1=0,sum2=0,sum3=0,j,temp=0,k=0,m;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number size of the array:");
        n=input.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int arr3[]=new int[n];
        int arr4[]=new int [n];
        System.out.println("Enter the number of digits to be added n the array:");
                m=input.nextInt();
        System.out.println("Enter the elemnts of the first  array: ");
        for(i=0;i<m;i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for(i=0;i<m;i++)
        {
            arr2[i]=input.nextInt();
        }
        for(i=0;i<m;i++)
        {
            sum1=sum1*10+arr1[i];
            sum2=sum2*10+arr2[i];
        }
        sum3=sum1+sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        while(sum3>0)
        {
            arr3[k]=sum3%10;
            sum3=sum3/10;
            k++;
        }
        for(i=0;i<m+1;i++)
        {
            System.out.print(arr3[i]);
        }

        j=m;
        for(i=0;i<m+1;i++)
        {
            temp=arr3[i];
            arr3[i]=arr4[j];
            arr4[j]=temp;
            j--;
        }
        System.out.println("\n");
        for(j=0;j<m+1;j++)
        {
            System.out.print(arr4[j]);
        }

    }
}
