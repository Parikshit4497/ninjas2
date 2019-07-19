package RevisionCodingNinjas.Array1;

import java.util.Scanner;

public class FindTheDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,sumOdd=0,sumEven=0,n;
        int arr[];
        n=sc.nextInt();
        arr=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){

            if(i%2==0){
                sumEven+=arr[i];
            }else{
                sumOdd+=arr[i];
            }
        }
        if(sumEven>sumOdd){
            System.out.println("The difference is:" +(sumEven-sumOdd));
        }else{
            System.out.println("The difference is: " +(sumOdd-sumEven));
        }
    }
}
