package RevisonComp.array;

import java.util.Scanner;

public class SumOfTriplets {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int num;
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        num=s.nextInt();
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                for(k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==num){
                        System.out.println(arr[i] +" "+arr[j] +" " +arr[k]);
                    }
                }
            }
        }

    }
}
