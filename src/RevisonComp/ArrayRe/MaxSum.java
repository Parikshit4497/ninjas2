package RevisonComp.ArrayRe;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        int m,i,j;
        int result=0 ;
        int n,sum1=0,sum2=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr1[]=new int[n];

        for(i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        m=s.nextInt();
        int arr2[]=new int[m];
        for(i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
        }
        for(i=0,j=0;i<arr1.length&&j<arr2.length;){
            if(arr1[i]<arr2[j]){
                sum1+=arr1[i];
                i++;
            }else if(arr2[j]<arr1[i]){
                sum2+=arr2[j];
                j++;
            }else {
                result+=Math.max(sum1,sum2);
                sum1=0;
                sum2=0;
                while (i <arr1.length &&j<arr2.length&&arr1[i]==arr2[j]){
                    result+=arr1[i];
                    i++;
                    j++;
                }
            }
        }
        while(i< arr1.length){
            sum1+=arr1[i];
            i++;
        }
        while(j<arr2.length){
            sum2+=arr2[j];
            j++;
        }
        result+=Math.max(sum1,sum2);
        System.out.println("Result " + result);
    }
}
