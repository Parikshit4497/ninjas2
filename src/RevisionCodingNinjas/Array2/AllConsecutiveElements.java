package RevisionCodingNinjas.Array2;

import java.util.Arrays;
import java.util.Scanner;

public class AllConsecutiveElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0,j=0,result=0;
        boolean status=false;

        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                 status=true;
            }else{
                status=false;
                break;
            }
        }
        System.out.println("Result" + status);
    }
}
