package RevisonComp.array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m,i;
        System.out.println("Enter the size of the array");
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number you wish to search :");
        n=s.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==n){
                System.out.println("The number is present ");
            }
        }
    }
}
