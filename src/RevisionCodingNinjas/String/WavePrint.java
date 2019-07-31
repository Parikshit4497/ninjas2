package RevisionCodingNinjas.String;

import java.util.Scanner;

public class WavePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,m=0,i=0,j=0;
        System.out.println("Enter number of rows");
        n=sc.nextInt();
        System.out.println("Enter number of columns");
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        i=0;
        j=0;
             while(j!=arr[0].length){
                 if(i==0){
                     for(i=0;i<arr.length;i++){
                         System.out.print(arr[i][j]+" ");
                     }
                     j++;
                 }else if(i==arr.length){
                     for(i=arr.length-1;i>=0;i--){
                         System.out.print(arr[i][j]+" ");
                     }
                     j++;
                     i++;
                 }
             }
        sc.close();
    }
}
