package RevisionCodingNinjas.String;

import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,i=0,j=0;
        int n=0,m=0;
        System.out.println("Enter the number of rows ");
        n=sc.nextInt();
        System.out.println("Enter the number of columns");
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        i=0;
        j=0;
        while(count<arr.length*arr[0].length){
            for(;j<arr[i].length&&arr[i][j]!=-1;j++){
                System.out.print(arr[i][j] +" ");
                arr[i][j]=-1;

                count++;
            }
            j--;
            i++;
            for(;i<arr.length&&arr[i][j]!=-1;i++){
                System.out.print(arr[i][j]+" ");
                arr[i][j]=-1;

                count++;
            }
            i--;
            j--;
            for(;j>=0&&arr[i][j]!=-1;j--){
                System.out.print(arr[i][j]+ " ");
                arr[i][j]=-1;
                count++;
            }
            i--;
            j++;
            for(;i>=0&&arr[i][j]!=-1;i--){
                System.out.print(arr[i][j] + " ");
                arr[i][j]=-1;

            }
            i++;j++;
        }

        sc.close();
    }
}
