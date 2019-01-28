package RevisonComp.Recursion;

import Recursion1.LastIndex;

import java.util.Scanner;

public class LastIndexOfANumber {
    public static  int LastIndex(int input[],int index,int c){

        if(index==input.length-1){
            return -1;
        }
          int lisa=LastIndex(input,index+1,c);
             if(lisa!=-1){
                 return lisa;
             }else{
                 if(input[index]==c){
                     return index;
                 }else{
                     return -1;
                 }
             }
    }
    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          int m=s.nextInt();
          int input[]=new int[m];
          for(int i=0;i<input.length;i++){
              input[i]=s.nextInt();
          }
          int c=s.nextInt();
        System.out.println("The last index of the number is:" + LastIndex(input,0,c));
    }
}
