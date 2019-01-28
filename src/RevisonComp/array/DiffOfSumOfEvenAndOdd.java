package RevisonComp.array;

import java.util.Scanner;

public class DiffOfSumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n ,sumEven=0,sumOdd=0,i;
        int result=0;
        System.out.println("Enter the size of the array:");
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumEven=sumEven+arr[i];
            }else{
                sumOdd=sumOdd+arr[i];
            }
        }
        result=sumEven-sumOdd;
        System.out.println("The result of the number is:" +result);
    }
}
