package RevisonComp.array;

import java.util.Arrays;
import java.util.Scanner;

public class RotatateArray {
    public static void main(String[] args) {
        int i;
        int j;
        int counter=0,n,m;
        Scanner s=new Scanner(System.in);
         n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        m=s.nextInt();
        int arr1[]=new int[arr.length];
        j=0;
        for(i=m;i<arr.length;i++){
            arr1[j]=arr[i];
            j++;
        }
        for(i=0;i<m;i++){
            arr1[j]=arr[i];
            j++;
        }
        System.arraycopy(arr,0,arr1,0,arr.length);
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
