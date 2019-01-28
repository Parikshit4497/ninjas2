package RevisonComp.array;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        int i,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                break;
            }
        }
        System.out.println("The duplicate element is " + arr[i]);
    }
}
