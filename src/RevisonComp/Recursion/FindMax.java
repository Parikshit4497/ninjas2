package RevisonComp.Recursion;

import java.util.Scanner;

public class FindMax {
    public static int findMax(int input[],int index){
        if( (index ==input.length-1)){
            return input[index];
        }

        int misa=findMax(input,index+1);
        if(misa>input[index]){
            return  misa;
        }else{
            return input[index];
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m;
        int i;
        m=s.nextInt();
        int input[]=new int[m];
        for(i=0;i<input.length;i++){
            input[i]=s.nextInt();
        }
        System.out.println("The maximum no in the array is " + findMax(input,0));

    }
}
