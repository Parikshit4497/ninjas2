package RevisionCodingNinjas.Array1;

import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,temp=0,n=0;

        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0,j=arr.length-1;i<=j;){

            if(arr[j]==0&&arr[i]==1){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if(arr[i]==0){
                i++;
            }else if(arr[j]==1){
                j--;
            }

        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
