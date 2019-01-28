package RevisonComp.array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayRotation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,count=1;
        System.out.println("Array size");
        n=s.nextInt();
        int arr[]=new int[n];

        for(i =0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        for(i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                count++;

            }else{
                break;
            }
        }
        if(i==arr.length-1){
            count=count-arr.length;
        }
        System.out.println("The number of elements by which the array is rotated is " + count);
    }
}
