package RevisonComp.ArrayRe;

import challenge.A;

import java.util.Scanner;

public class PushZeroestToEnd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        int i;
        int k=0;
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0; i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int nonzero=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonzero];
                arr[nonzero]=temp;
                nonzero++;
            }
        }

        for (i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
