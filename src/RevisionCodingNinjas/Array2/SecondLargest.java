package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,n=0,largest=0,seccondlargest=Integer.MIN_VALUE;
        int arr[]=new int[n];
        largest=arr[0];
        for(i=0;i<arr.length;i++){
            if(largest<arr[i]){
                seccondlargest=largest;
                largest=arr[i];
            }else{
                if(seccondlargest<arr[i]&&arr[i]!=largest){
                    seccondlargest=arr[i];
                }
            }
        }
        System.out.println("The second largest is" +seccondlargest );
        sc.close();
    }
}
