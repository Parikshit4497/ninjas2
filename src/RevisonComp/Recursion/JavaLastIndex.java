package RevisonComp.Recursion;

import java.util.Scanner;

public class JavaLastIndex {
    public static int LastIndex(int input[],int index,int c){

        if(input.length==index){
            return -1;
        }
       int ans=LastIndex(input,index+1,c);
        if(ans==-1){
            if(input[index]==c){
                return index;
            }else{
                return  -1;
            }
        }else{
            return -1;
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int i;
        int input[]=new int[m];
        for(i=0;i<input.length;i++){
            input[i]=s.nextInt();
        }
        int c=s.nextInt();
        System.out.println("The last index of the number " + LastIndex(input,0,c));
    }
}
