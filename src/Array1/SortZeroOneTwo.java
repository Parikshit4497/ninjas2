package Array1;

import java.util.Scanner;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0,zeroindex=0;
        int i=0,twoindex=0;
        n=s.nextInt();
        int[] arr=new int[n];

        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        zeroindex=0;
        twoindex=arr.length-1;
        int temp=0;
        for(i=0;i<=twoindex;){

            if(arr[i]==0){
                temp=arr[zeroindex];
                arr[zeroindex]=arr[i];
                arr[i]=temp;
                i++;
                zeroindex++;
            }else if(arr[i]==2){
                temp=arr[twoindex];
                arr[twoindex]=arr[i];
                arr[i]=temp;

                twoindex--;
            }else{
                i++;
            }
        }

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        s.close();
    }
}
