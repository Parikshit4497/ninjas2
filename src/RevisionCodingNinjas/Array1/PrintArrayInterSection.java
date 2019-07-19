package RevisionCodingNinjas.Array1;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayInterSection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,k=0,i=0,j=0,m=0;
        System.out.println("Enter the number of elements in first array");
        n=sc.nextInt();
        int arr1[]=new int[n];

        for(i=0;i< arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the number of elements in second array ");
        m=sc.nextInt();
        int arr2[]=new int[m];
        for(j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(i=0,j=0;i<arr1.length&&j<arr2.length;){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
}
