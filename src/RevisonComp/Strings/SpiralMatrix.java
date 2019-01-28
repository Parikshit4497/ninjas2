package RevisonComp.Strings;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m,n;
        int i,j;
        int count=0;
        m=s.nextInt();
        n=s.nextInt();
        int matrix[][]=new int[m][n];

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[ i ].length; j++) {
                matrix[ i ][ j ] = s.nextInt();
            }
        }
        i=0;
        j=0;
        while(count<matrix.length*matrix[0].length){


            for(;j<matrix[i].length&&matrix[i][j]!=-1;j++){
                System.out.print(matrix[i][j]+" ");
                matrix[i][j]=-1;
                count++;
            }
            j--;
            i++;
            for(;i<matrix.length&&matrix[i][j]!=-1;i++){
                System.out.print(matrix[i][j]+" ");
                matrix[i][j]=-1;
                count++;
            }
            i--;
            j--;
            for(;j>=0&&matrix[i][j]!=-1;j--){
                System.out.print(matrix[i][j]+" ");
                matrix[i][j]=-1;
                count++;
            }
            i--;
            j++;
            for(;i>=0&&matrix[i][j]!=-1;i--){
                System.out.print(matrix[i][j]+" ");
                matrix[i][j]=-1;
                count++;
            }
            i++;
            j++;
        }
    }
}
