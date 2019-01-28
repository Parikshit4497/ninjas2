package RevisonComp.Recursion;

import java.util.Scanner;

public class FindFirstIndex {
    public static  int firstIndex(int input[],int index,int c){

//        if(index<input.length){
//            if(input[index]==c){
//                return index;
//            }
//            return firstIndex(input,index+1,c);
//        }else{
//            return -1;
//        }

        if(index==input.length-1){
            return -1;
        }
        if(input[index]==c){
            return index;
        }else{
            int firstIndex=firstIndex(input,index+1,c);
            return firstIndex;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m;
        m=s.nextInt();
        int input[]=new int[m];
        for(int i=0;i<input.length;i++){
            input[i]=s.nextInt();
        }
        int c=s.nextInt();
        System.out.println("The first index of the number is " + c +":" + firstIndex(input,0,c));
    }
}
