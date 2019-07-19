package RevisionCodingNinjas.Array1;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,n=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                break;
            }
        }
        System.out.print("Ans " +arr[i]);
    }
}
