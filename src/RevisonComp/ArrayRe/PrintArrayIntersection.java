package RevisonComp.ArrayRe;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayIntersection {
    public static void main(String[] args) {
        int i,j,n,m;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int arr1[]=new int[n];
        for(i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        m=s.nextInt();
        int arr2[]=new int[m];

        for(j=0;j<arr2.length;j++){
            arr2[j]=s.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length<arr2.length){
        for(i=0,j=0;i<arr1.length&&j<arr2.length;){
            if(arr2[j]==arr1[i]){
                System.out.print(" " +arr1[i]);
                i++;
                j++;
                continue;

            }
            else if(arr1[i]<arr2[j]){
                i++;
                continue;
            }else if(arr2[j]<arr2[i]){
                j++;
                continue;
            }
        }
        }else if(arr2.length< arr1.length){
            for(i=0,j=0;i<arr2.length&&j<arr1.length;){
                if(arr2[i]==arr1[i]){
                    System.out.print(" " + arr2[i]);
                    i++;
                    j++;
                    continue;
                }else if(arr2[i]<arr1[j]){
                    i++;
                    continue;
                }else if(arr1[j]<arr2[i]){
                    j++;
                    continue;
                }
            }
        }


    }
}
