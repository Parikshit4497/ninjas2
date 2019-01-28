package Array1;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0,i=0,j=0;
        int secondLargest=0,largest=0;
        n=s.nextInt();
        int[] arr=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        largest=arr[0];
        secondLargest=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }else{
                if(secondLargest<arr[i]&arr[i]!=largest){
                    secondLargest=arr[i];
                }
            }


        }
        System.out.println("The second largest element is " + secondLargest);
        s.close();
    }
}
