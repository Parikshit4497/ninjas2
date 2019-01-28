package RevisonComp.array;

import java.util.Scanner;

public class SwapAlterNate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,j,a=0;
        System.out.println("Declare the size of the array");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length-1;i=i+2){
               a=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=a;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
