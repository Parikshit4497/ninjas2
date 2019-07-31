package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class LastIndex {

    public static int lastIndexOfData(int arr[],int data ,int vidx){
        if(arr.length==vidx){
            return  -1;
        }
        int lastIndex=lastIndexOfData(arr,data,vidx+1);
        if(lastIndex!=-1){
            return  lastIndex;
        }else{
            if(arr[vidx]==data){
                return lastIndex;
            }else{
                return -1;
            }
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
        System.out.println("The last index of the data is"+ lastIndexOfData(arr,data,0) );

        sc.close();
    }
}
