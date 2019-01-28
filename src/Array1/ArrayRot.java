package Array1;

import java.util.Scanner;

public class ArrayRot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,n=0,count=1;
        n=s.nextInt();
        int[] arr=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }else{
                break;
            }
        }
        if(i==arr.length-1){
            count=count-arr.length;
        }
        System.out.println("The array rotation "+ count );
    }
}
