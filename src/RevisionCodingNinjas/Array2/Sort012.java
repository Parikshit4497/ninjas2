package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i=0,j=0,nextTwo,nextZero=0,temp;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        i=0;
        nextZero=0;
        nextTwo=arr.length-1;
        while(i<=nextTwo){
            if(arr[i]==0){

                temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                i++;nextZero++;
            }else if(arr[i]==2){
                temp=arr[nextTwo];
                arr[nextTwo]=arr[i];
                arr[i]=temp;
                i++;
                nextTwo--;
            }else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}
