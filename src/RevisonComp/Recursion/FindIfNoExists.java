package RevisonComp.Recursion;

import java.util.Scanner;

public class FindIfNoExists {
    public static boolean findNoExists(int input[],int index,int c){
        if(input.length-1==index){
            return false;
        }

//        if(isTrue){
//            return true;
//        }else{
//           /* if(input[index]==c){
//                return true ;
//            }else{
//                return  false ;
//            }*/
//           return input[index]==c;
//        }
        if(input[index]==c){
            return  true ;
        }else{

            boolean isTrue=findNoExists(input,index+1,c);
            return isTrue;
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
        System.out.println("The no " + c + " exists in the array " + findNoExists(input,0,c));
    }
}
