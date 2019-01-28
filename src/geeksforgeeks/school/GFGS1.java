package geeksforgeeks.school;

/**
 * Given a number N. You need to write a program to count the number of digits in N
 * which evenly divides N.

 Input:
 First line of input contains an integer T which denotes the number of test cases.
 T test cases follows. First line of each test case contains a single integer N.

 Output:
 For each test case in a new line print the total number of digits of N which evenly divides N.

 Constraints:
 1<=T<=100
 1<=N<=105

 Example:
 Input:
 3
 12
 1012
 23
 */

import java.util.Scanner;

public class GFGS1 {
    public static void main(String[] args) {
        int N ;
        int M,a;
        int count=0;
        int T;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter thr number of test cases:");
        T=s.nextInt();

        while(T>0) {
            System.out.println("Enter the number");
            N=s.nextInt();
            M=N;
            count=0;
            while (N > 0) {
                a = N % 10;
                if (a != 0) {
                    if (M % a == 0) {
                        count++;
                    }
                    N = N / 10;
                }
                else
                {
                    N=N/10;
                    continue;
                }
            }

            System.out.println("The number of digits is "+ count);
            T--;
        }
    }
}
