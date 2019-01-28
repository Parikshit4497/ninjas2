package RevisonComp.Recursion;

import java.util.Scanner;

public class AllIndexes {
    public static  int[] allIndexes(int input[],int index,int c,int index2){
        if(input.length==index){
            return  new int[index2];
        }
        int result[];
        if (input[index]==c){
            result=allIndexes(input,index+1,c,index2+1);
            result[index2]=index;
        }else{
            result=allIndexes(input,index+1,c,index2);
        }
return  result ;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int input[]=new int[m];
        for(int i=0;i<input.length;i++){
            input[i]=s.nextInt();
        }
        int c=s.nextInt();
        int arr[]=allIndexes(input,0,c,0);
    for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]+" ");
    }

    }

}
