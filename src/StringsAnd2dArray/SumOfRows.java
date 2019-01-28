package StringsAnd2dArray;

import java.util.Scanner;

/**
 * Created by hp on २२-०६-२०१७.
 */
public class SumOfRows {
    public static void main(String[] args) {
        int n, m,i,j,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the the size of row");
        n = s.nextInt();
        System.out.println("Enter the  size of column");
        m = s.nextInt();
        int arr[][] = new int[ n ][ m ];
        System.out.println("Enter the elements in the row and the column");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr[ i ][ j ] = s.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            sum=0;
            for (j = 0; j < m; j++) {
              sum+=arr[ i ][ j ];
            }
            System.out.print(sum+" ");
        }


    }
}
