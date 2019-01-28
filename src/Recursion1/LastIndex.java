package Recursion1;

import java.util.Scanner;

public class LastIndex{;

    public static void main(String[] args) {

        int n, i,x;
        int  g;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = s.nextInt();
        int arr[] = new int[ n ];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[ i ] = s.nextInt();
        }
        System.out.println("Enter the number:");
        x = s.nextInt();
        ArraySearch(arr,0,x);
    }
    public static int ArraySearch(int [] arr,int index,int num) {
           if(arr.length==index)
           {
               return -1;
           }



        int ans=ArraySearch(arr,index+1,num);
           if(ans==-1)
           {
               if(arr[index]==num)
               {
                   return index;
               }
               else
               {
                   return -1;
                     }
           }
           else
           {
               return ans;
           }
    }
}
