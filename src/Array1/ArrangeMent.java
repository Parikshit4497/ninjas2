package Array1;
import java.util.Scanner;
public class ArrangeMent {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int i=0,j=0,num=1;
        i=0;
        j=arr.length-1;
        while(i<j){
            arr[i]=num;
            num++;
            i++;


            arr[j]=num;
            num++;
            j--;


        }
        if(i==j){
            arr[i]=num;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        s.close();
    }
}
