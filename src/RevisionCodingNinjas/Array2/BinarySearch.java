package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearch(int[] arr, int n, int x){

        int start=0;
        int end=n-1;
        int mid;
        int pos=0;
        while(start<=end) {
            mid=(start+end)/2;
            if (arr[ mid ] < x) {
                start = mid + 1;
            } else if (arr[ mid ] > x) {
                end = mid - 1;
            } else if (arr[ mid ] == x) {
               return mid;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        BinarySearch b1=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,n,x;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        x=sc.nextInt();
        System.out.println("The position is " + b1.BinarySearch(arr,n,x));
        sc.close();
    }
}
