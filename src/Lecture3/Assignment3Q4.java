package Lecture3;

/**
 * Created by hp on १४-०६-२०१७.
 */
import java.util.Scanner;
public class Assignment3Q4 {
    public static void main(String[] args) {
        int a, sum1=0, b,c, sum2=0,n;
        int arr1[] = new int[20], i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no elements in the array:");
                n=input.nextInt();
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++)
        {
            arr1[i]=input.nextInt();
        }
        for(i=0;i<n;i++)
        {
            a=arr1[i];
            if(a>0)
            {
                b=a;
                sum1=sum1+b;
            }
            else if(a<0)
            {
                c=a;
                sum2=sum2+c;
            }
        }
        System.out.println("The sum of all positive numbers of the array is:" +sum1);
        System.out.println("The sum of all negative numbers of the array is:" +sum2 );
    }

}
