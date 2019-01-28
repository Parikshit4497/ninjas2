package RevisonComp.Recursion;

import java.util.Scanner;

public class SumOfElemOfArr {
    public static  int sumOfArra(int input[],int index){
        if(index<input.length){
            return sumOfArra(input,index+1)+ input[index];
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m;
        m=s.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        System.out.println("The sum of elements of the array is " +sumOfArra(arr,0));
    }
}
