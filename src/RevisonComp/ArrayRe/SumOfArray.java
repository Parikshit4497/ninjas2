package RevisonComp.ArrayRe;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m,c,a=0,b,k=0,i,j;
        //System.out.println("Enter teh size of first array ");
        n=s.nextInt();
        int arr1[]=new int [n];
       // System.out.println("Enter teh elements of first array ");

        for(i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        //System.out.println("Enter the size of the second array ");
        m=s.nextInt();
        int arr2[]=new int[m];
       for(i=0;i<arr2.length;i++){
           arr2[i]=s.nextInt();
       }

        int result_Arr[];
        if(arr1.length>arr2.length){
            result_Arr=new int[arr1.length+1];
       }else{
            result_Arr=new int[arr2.length+1];
       }
       k=result_Arr.length-1;
       for(i=arr1.length-1,j=arr2.length-1;i>=0&&j>=0;i--,j--){
           c=arr1[i]+arr2[j] +a;
           b=c%10;
           result_Arr[k--]=b;
           a=c/10;
       }if(j==-1){
           while(i>=0) {
               c = arr1[ i ] + a;
               b = c % 10;
               result_Arr[ k-- ] = b;
               a = c / 10;
               i--;
           }

        }else if (i==-1){

            while(j>=0) {
                c = arr2[ j ] + a;
                b = c % 10;
                result_Arr[ k-- ] = b;
                a = c / 10;
                j--;
            }
        }
        if(i==j){
            result_Arr[k--]=a;
        }
        System.out.println();
       for(i=0;i<result_Arr.length;i++){
           System.out.print(result_Arr[i]+" ");
       }
    }
}
