package Array1;

import java.util.Scanner;

public class ShiftZero {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0,i=0,nonzero=0,temp=0;
        n=s.nextInt();

        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp=arr[i];
                arr[i]=arr[nonzero];
                arr[nonzero]=temp;
                nonzero++;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
