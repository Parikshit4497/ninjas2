package Array1;
import java.util.Scanner;
public class SwapAlternate {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int i;
        int temp=0;
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        if(arr.length%2==0){
            for(i=0;i<arr.length;i+=2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }else{
            for(i=0;i<arr.length-1;i+=2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        s.close();
    }
}
