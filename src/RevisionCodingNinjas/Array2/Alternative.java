package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class Alternative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pos=0,neg=0,temp,n=0,i=0;
        n=sc.nextInt();
        int arr[]=new int[n];
                for(i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();
                }
          int[] output=new int[arr.length];
         i=0;
          while((pos<arr.length)&&neg<arr.length){
              if(arr[pos]<0){
                  pos++;
              }else if(arr[neg]>=0){
                  neg--;
              }else{
                  output[i]=arr[pos];
                  pos++;
                  i++;
                  output[i]=arr[neg];
                  neg--;
                  i++;
              }

          }
          for(i=0;i<arr.length;i++){
              arr[i]=output[i];
          }
          for(i=0;i<arr.length;i++){
              System.out.println(arr[i]+ " ");
          }

        sc.close();
    }
}
