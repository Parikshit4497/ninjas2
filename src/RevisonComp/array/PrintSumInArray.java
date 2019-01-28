package RevisonComp.array;

import java.util.Scanner;

public class PrintSumInArray {
    public static void main(String[] args) {
        int n;
        int i;
        int j;
        int x;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        x=s.nextInt();

        for(i=0,j=arr.length-1;i<arr.length&&j>=0;){
            if(i!=j){
            if(arr[i] +arr[j]==x){
                i++;
                j--;
                System.out.println("i"+arr[i]+","+"j" +arr[j]);
                continue;
            }
            else if(arr[i]<arr[j]){
                i++;
            }else if(arr[i]>arr[j]){
                j--;
            }}else if(i==j){
                break;
            }

        }
    }
}
