package RevisionCodingNinjas.Array2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0,j=0,MAX=Integer.MIN_VALUE,temp=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++){
            temp=arr[i];
            for(j=i+1;j<arr.length;j++) {
                if (MAX < (arr[ j ] - temp)) {
                    MAX = arr[ j ] - temp;
                }
            }
        }
        System.out.println("max" +MAX);
        sc.close();
    }
}
