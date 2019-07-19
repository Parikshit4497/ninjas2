package RevisionCodingNinjas.Array1;

import java.util.Scanner;

public class ArrangeNumbersInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,a=1,n;
        int arr[];
        n=sc.nextInt();
        arr=new int[n];
        i=0;
        j=arr.length-1;
        while(i<=j&&a<=n){
            arr[i]=a++;
            i++;
            arr[j]=a++;
            j--;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
