package Array1;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int so=0,fo=0,mid=0;
        int[] arr;
        int n=0,i=0;
        int num;
        n=s.nextInt();
        arr=new int[n];

        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        num=s.nextInt();
        so=0;
        fo=arr.length-1;
        mid=(so+fo)/2;
        while(so<=fo){

            if(arr[mid]==num){
                System.out.println("index of number is "+ mid);
                break;
            }
            else if(arr[mid]<num){
                so=mid+1;
             }
             else if(arr[mid]>num){
                fo=mid-1;
            }
          mid=(so+fo)/2;
        }

    }
}
