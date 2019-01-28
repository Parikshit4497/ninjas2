package Array1;

import java.util.Arrays;
import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
         int n=s.nextInt();
         int arr[]=new int[n];
         int i=0;
        for (i = 0; i <arr.length; i++) {

            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<arr.length;i+=2){

          if(arr[i]!=arr[i+1]){
              System.out.println(arr[i]);
              break;
          }

        }

     }
}







