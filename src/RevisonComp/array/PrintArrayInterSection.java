package RevisonComp.array;

import ArrayListAutUnbox.Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayInterSection {
    public static void main(String[] args) {
        int i,j;
        int n,m;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of elements in the array1");
        n=scanner.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter the elements in first array");
        for(i=0;i<arr1.length;i++) {
            arr1[ i ] = scanner.nextInt();
        }
        System.out.println("Enter the number of elements in the second array :");
        m=scanner.nextInt();
        int []arr2=new int[m];
        System.out.println("Enter the elements of second array");
        for(j=0;j<arr2.length;j++){
            arr2[j]=scanner.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(arr1.length<arr2.length){
            for(i=0,j=0;i<arr1.length&&j<arr2.length;){
                if(arr1[i]==arr2[j]){
                    i++;
                    j++;
                    System.out.println(arr1[i]);
                    continue;
                }else if(arr1[i]<arr2[j]){
                    i++;
                    continue;
                }else if(arr2[j]<arr1[i]){
                    j++;
                    continue;
                }
            }
        }else if(arr2.length<arr1.length){
            for(i=0,j=0;i<arr2.length&&j<arr1.length;){
                if(arr2[i]==arr1[j]){
                    i++;
                    j++;
                    System.out.println(arr2[i]);
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
