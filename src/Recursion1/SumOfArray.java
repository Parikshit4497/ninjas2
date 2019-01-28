package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on २१-०६-२०१७.
 */
public class SumOfArray {
    public static void main(String[] args) {
        int n, i, g;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = s.nextInt();
        int input[] = new int[ n ];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            input[ i ] = s.nextInt();
        }
        g = sum(input);
        System.out.println("the sum of the array is" + g);
    }
    public static int sum(int input[]) {
        int c=0;

        c=sumofarray(input,0);
        return c;

    }
    public static int sumofarray(int input[],int index )
    {
        if (index<input.length){

            return input[index]+sumofarray(input,index+1);
        }
        else
        {
            return 0;
        }
    }
}
