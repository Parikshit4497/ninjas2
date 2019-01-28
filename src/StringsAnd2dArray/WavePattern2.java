package StringsAnd2dArray;

import java.util.Scanner;

/**
 * Created by hp on २४-०६-२०१७.
 */
public class WavePattern2 {
    public static void main(String[] args) {
        int row = 0, col = 0, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows of the array:");
        row = s.nextInt();
        System.out.println("Enter the columns of array:");
        col = s.nextInt();
        System.out.println("Enter the elements of the array:");
        int input[][] = new int[ row ][ col ];
        for (i = 0; i < input.length; i++) {
            for (j = 0; j < input[ i ].length; j++) {
                input[ i ][ j ] = s.nextInt();
            }
        }
        System.out.println("The array you enetered is");
        for (i = 0; i < input.length; i++) {
            for (j = 0; j < input[ i ].length; j++) {
                System.out.print(input[ i ][ j ] + " ");
            }
            System.out.print("\n");
        }
        wave(input);
    }

    public static void wave(int input[][]) {
        int[] temp = new int[ input.length * input[ 0 ].length ];
        int i, j, k = 0, l;
        for (i = 0, j = 0; j < input[ 0 ].length && i < input.length; ) {
            if (i == 0) {
                while (i < input.length) {
                    temp[ k++ ] = input[ i++ ][ j ];
                }
                i = i - 1;
            }
            j++;
            if (j < input[ i ].length) {
                if (i == input.length - 1) {
                    while (i >= 0) {
                        temp[ k++ ] = input[ i-- ][ j ];

                    }
                    i = i + 1;
                    j++;
                }
            } else {
                break;
            }

        }

        for (l = 0; l < input.length * input[ 0 ].length; l++) {
            System.out.print(temp[ l ] + " ");
        }
    }
}




