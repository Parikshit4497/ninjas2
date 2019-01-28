import java.util.Scanner;
public class Spiral {
    public static void main(String[] args) {
        int row = 0, col = 0, i = 0, j = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows of the array:");
        row = s.nextInt();
        System.out.println("Enter the columns of array:");
        col = s.nextInt();
        System.out.println("Enter the elements of the array:");
        int matrix[][] = new int[ row ][ col ];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[ i ].length; j++) {
                matrix[ i ][ j ] = s.nextInt();
            }
        }
        spiral(matrix);
    }
    public static void spiral(int matrix[][])
        {   int count = 0;
            int i=0,j=0;
        while (count != (matrix.length * matrix[ 0 ].length)) {
            for (; j < matrix[ i ].length && matrix[ i ][ j ] != -1; j++) {
                System.out.print(matrix[ i ][ j ] + " ");
                matrix[ i ][ j ] = -1;
                count++;
            }
            i++;
            j--;
            for (; i < matrix.length && matrix[ i ][ j ] != -1; i++) {
                System.out.print(matrix[ i ][ j ] + " ");
                matrix[ i ][ j ] = -1;
                count++;
            }
            j--;
            i--;
            for (; j >= 0 && matrix[ i ][ j ] != -1; j--) {
                System.out.print(matrix[ i ][ j ] + " ");
                matrix[ i ][ j ] = -1;
                count++;
            }
            i--;
            j++;
            for (; i >= 0 && matrix[ i ][ j ] != -1; i--) {
                System.out.print(matrix[ i ][ j ] + " ");
                matrix[ i ][ j ] = -1;
                count++;
            }
            j++;
            i++;
        }
    }
    }


