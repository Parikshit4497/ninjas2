package Array1;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0, count = 0, temp = 0, i = 0;
        n = s.nextInt();
        int[] arr = new int[ n ];

        for (i = 0; i < arr.length; i++){
           arr[i]=s.nextInt();
        }
        int ro=s.nextInt();

        while(count<ro){
            temp=arr[0];
            for(i=0;i<arr.length-1;i++){

                arr[i]=arr[i+1];
            }
            arr[i]=temp;
            count++;
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        s.close();
    }
}
