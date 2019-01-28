package Recursion1;


import java.util.Scanner;

public class CheckANumber {
    public static void main(String[] args) {
        int n, i,x;
        boolean g;
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
        g=checkNumber(input,x);
        System.out.println("Does the number exist in the array:"+ g);
    }
    public static boolean checkNumber(int input[], int x) {
        boolean c;

        c=search(input,0,x);
        return c;
    }
    public static boolean search(int input[],int index,int x)
    {
        if(input.length==index)
        {
            return false;
        }
        if(input[index]==x)
        {
            return true;
        }
        return search(input,index+1,x);
    }
}
