package RevisonComp.array;

import java.util.Scanner;

public class pushZeroesAtEnd {
    public static void main(String[] args) {
        int i,j=0;
        int n;
        int counter=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[] =new int[n];

        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++){
           if(arr[i]!=0){
               arr[counter++]=arr[i];
           }
        }
        while(counter<arr.length){
            arr[counter++]=0;

        }



        for (i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
