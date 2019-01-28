package Array1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0,m=0 ;
        int  i=0,j=0;
        n=s.nextInt();
        int[] arr1=new int[n];
        for(i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        m=s.nextInt();
        int[] arr2=new int[m];
        for(i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length<arr2.length){
            for(i=0,j=0;i< arr1.length&&j<arr2.length;)
            if(arr1[i]<arr2[j]){
                i++;
                continue;
            }else if(arr1[i]>arr2[j]){
                j++;
                continue;
            }else if( arr1[i]==arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
                continue;
            }
        }else if(arr2.length<arr1.length){
            for(i=0,j=0;i<arr1.length&&j<arr2.length;)
            if(arr2[i]<arr1[j]){
                i++;
                continue;
            }else if(arr2[i]>arr1[j]){
                j++;
                continue;
            }else if(arr2[i]==arr1[j]){
                System.out.println(arr2[i]);
                i++;
                j++;
                continue;

            }
        }
        s.close();
    }
}
