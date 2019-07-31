package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class SpecialSumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i=0,j=0,sum=0,a=0,b=0,fin=0;
        n=sc.nextInt();
        int arr[]=new int[n];

        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        while(sum!=0){
            a=sum%10;
            b=sum/10;
            sum=a+b;
            if(sum<10){
                break;
            }
        }
        System.out.println("Result" +sum);

    }
}
