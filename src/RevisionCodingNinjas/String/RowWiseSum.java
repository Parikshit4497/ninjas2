package RevisionCodingNinjas.String;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,m=0,i=0,j=0,sum=0;

        System.out.println("Enter the number of rows ");
        n=sc.nextInt();
        System.out.println("Enter the number of columns");
        m=sc.nextInt();
        int arr[][]=new int[4][2];
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<arr.length;i++){
            sum=0;
            for(j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }

            System.out.print(sum+" ");
        }

        sc.close();
    }
}
