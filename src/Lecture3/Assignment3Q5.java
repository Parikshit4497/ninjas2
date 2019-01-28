package Lecture3;

/**
 * Created by hp on १४-०६-२०१७.
 */

import java.util.Arrays;
import java.util.Scanner;
public class Assignment3Q5 {
    public static void main(String[] args) {
        int n,num,i,j;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        n=input.nextInt();
        int arr[]=new int [n];
                System.out.println("Enter the elements of teh array :");
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the number:");
        num=input.nextInt();
        Arrays.sort(arr);
        for(i=0;i<n;i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == num) {
                System.out.println("The pair is :"+arr[i]+","+arr[j]);
                }
            }
        }
    }
}
