package RevisonComp.ArrayRe;

import java.util.Scanner;

public class ArrangeNumInarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=1;
        int arr[] =new int[n];
        int i=0,j=arr.length-1;
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        i=0;
        while(i<j){
            arr[i]=num;
            num++;
            i++;
            arr[j]=num;
            num++;
            j--;
        }if(i==j){
            arr[i]=num;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
