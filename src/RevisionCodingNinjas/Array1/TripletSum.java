package RevisionCodingNinjas.Array1;

import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        int i=0,j=0,k=0,x=0;
        int n=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        x=sc.nextInt();
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                for(k=0;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}
