package Array1;

import java.util.Scanner;

public class SumOfTriplet {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0,j=0,i=0,k=0;
        n=s.nextInt();
        int arr[]=new int[n];
        int num=s.nextInt();
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                for(k=j+1;k<arr.length;k++){

                    if(arr[i]+arr[j]+arr[k]==num){
                        System.out.println(arr[i]+" " + arr[j] + " " + arr[k]);
                    }
                }
            }

        }
    }
}
