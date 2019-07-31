package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class CheckArrayRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=0,i=0,count=1;

        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }else{
                break;
            }
        }
        System.out.println("The array rotation is :" +count);
        sc.close();
    }
}
