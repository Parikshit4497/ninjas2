package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class FindAndReturnMultipleof2and3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,sum=0,n=0,temp=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            temp=arr[i];
            if(temp%2==0||temp%3==0){
                sum+=temp;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
