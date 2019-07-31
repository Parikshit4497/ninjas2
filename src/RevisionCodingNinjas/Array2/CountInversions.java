package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class CountInversions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,count=0;
        int n=0,temp;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
                temp=arr[i];
            for(j=i+1;j<arr.length;j++){
                if(temp>arr[j]){
                    count++;
                }
            }

        }
        System.out.println("The number of inversions:" +count);
        sc.close();
    }
}
