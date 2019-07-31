package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class FirstIndex {
    public static int printFirstIndex(int arr[],int data,int vindex){
        if(vindex==arr.length){
            return -1;
        }
        if(arr[vindex]==data){
            return vindex;
        }else{
            return printFirstIndex(arr,data,vindex+1);
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
      }
      int data =sc.nextInt();
        System.out.println("The index is "+printFirstIndex(arr,data,0));
      sc.close();
    }
}
