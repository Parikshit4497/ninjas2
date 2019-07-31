package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class PushZeroToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,n=0;
        int k=0,count=0;
        n=sc.nextInt();

        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
             for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }else{
                count++;
            }
             }

        while(k<arr.length){
                 arr[k++]=0;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
        sc.close();
    }
}
