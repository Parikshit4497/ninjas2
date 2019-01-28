package StringsAnd2dArray;

import java.util.Scanner;

/**
 * Created by hp on २४-०६-२०१७.
 */
public class WavePattern {
    public static void main(String[] args) {
        int row=0,col=0,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows of the array:");
        row=s.nextInt();
        System.out.println("Enter the columns of array:");
        col=s.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[][]=new int[row][col];
        for(i=0;i<arr.length;i++) {
            for (j=0;j <arr[i].length;j++)
            {
                arr[ i ][ j ] = s.nextInt();
            }
        }
        System.out.println("The array you enetered is");
                for(i=0;i<arr.length;i++)
                {
                    for(j=0;j<arr[i].length;j++)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.print("\n");
                }
        wave(arr);
    }
    public static void  wave(int arr[][])
    {
        int i,j;
        for(j=0,i=0;j<arr.length&&i<arr[j].length;) {
            if (i == 0) {
                while (i < arr.length) {
                    System.out.print(arr[ i++ ][ j ] + " ");

                }
                i = i - 1;

            }
            j++;
            if (j < arr[i].length) {
                if (i == arr.length - 1) {
                    while (i >= 0) {
                        System.out.print(arr[ i-- ][ j ] + " ");

                    }
                    i = i + 1;
                    j++;
                }
            }
            else
            {
                break;
            }
        }

        }
    }


