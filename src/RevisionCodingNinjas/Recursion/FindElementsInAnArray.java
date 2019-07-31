package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class FindElementsInAnArray {
    public static boolean FindElements(int[] arr,int data,int vidx){
          if(vidx==arr.length){
              return false;
          }
            if(arr[vidx]==data){
              return true;
            }else{
                return FindElements(arr,data,vidx+1);
            }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();

        System.out.println("The element is present in the array " + FindElements(arr,data,0));

        sc.close();
    }
}
