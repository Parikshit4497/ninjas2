package RevisionCodingNinjas.Array1;

import ArrayListAutUnbox.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeElementsInanArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int i=0,j=0,n=0;
         n=sc.nextInt();
         int arr[]=new int[n];
         for(i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
        Arrays.sort(arr);
         for(i=0,j=1;i<arr.length&&j<arr.length;){

             if(arr[i]==arr[j]){
                 i=i+2;
                 j=j+2;
             }else{

                 break;
             }

         }
        System.out.println("The unique element is "+ arr[i]);



    }
}
