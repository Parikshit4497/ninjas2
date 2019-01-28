package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on २१-०६-२०१७.
 */
public class FirstIndex {
    public static void main(String[] args) {
        int n, i,x;
        int  g;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = s.nextInt();
        int input[] = new int[ n ];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            input[ i ] = s.nextInt();
        }
        System.out.println("Enter the number:");
        x = s.nextInt();
        g=firstIndex(input,x);
        System.out.println("The first index of the number is"+ g);
    }
    public static int firstIndex(int input[], int x)
    {     int c;
            c=search(input,0,x);
            return c;
    }
    public static int search(int input[],int index,int x)
    {
        if(input.length==index)
        {
            return -1;
        }
        if(input[index]==x)
        {
            return index;
        }
        return search(input,index+1,x);
    }
}
