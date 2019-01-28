package RevisonComp.array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++) {
            sum=sum+arr[i];
        }
        System.out.println("The sum is "+ sum);
    }
}
