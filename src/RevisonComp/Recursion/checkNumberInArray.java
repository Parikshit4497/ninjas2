package RevisonComp.Recursion;

import java.util.Scanner;

public class checkNumberInArray {
    public  static boolean checkNumInArra(int arr[],int index,int c){
        if(index<arr.length){
            if(arr[index]==c){
                return true ;
            }
            return checkNumInArra(arr,index+1,c);
        }else{
            return false ;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m ;
        m=s.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int c=s.nextInt();
        System.out.println("The number that you are looking  for in the array is present " + checkNumInArra(arr,0,c));
    }
}
