package RevisonComp.Strings;

import java.util.Scanner;

public class SumOfRowsOfMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j;
        int m,n ,sum=0;

        n=s.nextInt();
        m=s.nextInt();
         int arr[][]=new int[n][m];

        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }

        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.print(sum+ " ");
            sum=0;
        }
    }
}
