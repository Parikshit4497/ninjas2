package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class UpdateValueDivsionBy4 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=0,i=0,divi=0;
     n=sc.nextInt();
     int arr[]=new int[n];
     for(i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }
     for(i=0;i<arr.length;i++){
         divi=arr[i]/4;
         if(divi==0){
             arr[i]=-1;
         }else{
          arr[i]=divi;
         }
     }
     for(i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
     sc.close();
    }
}
