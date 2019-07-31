package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,a=0,k=0,b=0,c=0,n,m;
        int resultArr[];
        n=sc.nextInt();
        int arr1[]=new int[n];
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        m=sc.nextInt();
        int arr2[]=new int[m];
        for(j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        if(arr1.length>arr2.length){
             resultArr=new int[arr1.length+1];
        }else{
             resultArr=new int[arr2.length+1];
        }
        i=arr1.length-1;
        j= arr2.length-1;
        k=resultArr.length-1;
        for(i=arr1.length-1,j=arr2.length-1;i>=0&&j>=0;i--,j--){
            c=arr1[i]+arr2[j]+b;
            resultArr[k--]=c%10;
            b=c/10;

        }
        if(j==-1){
            c=arr1[i]+b;
            resultArr[k--]=c%10;
            b=c/10;
            i--;

        }else if(i==-1){
            c=arr2[j]+b;
            resultArr[k--]=c%10;
            b=c/10;
            j--;
        }else if(i==j){
            resultArr[k--]=b;
        }
        for(i=0;i<resultArr.length;i++){
            System.out.print(resultArr[i]+" ");
        }
    }

}
