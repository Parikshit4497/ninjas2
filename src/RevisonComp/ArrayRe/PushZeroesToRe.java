package RevisonComp.ArrayRe;

import java.util.Scanner;

public class PushZeroesToRe {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i ;
        int j ;
        int nonzero=0;
        int n;
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
             int temp=arr[i];
             arr[i]=arr[nonzero];
            arr[nonzero]=temp;
            nonzero++;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
