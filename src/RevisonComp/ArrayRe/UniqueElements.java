package RevisonComp.ArrayRe;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(i=0,j=0 ;i<arr.length-1&&j<arr.length;){
            if(arr[i]==arr[j]){
                i=i+2;
                j=i+1;
            }else if(arr[i]!=arr[j]){
                break;
            }
        }
        System.out.print(arr[i]);
    }
}
