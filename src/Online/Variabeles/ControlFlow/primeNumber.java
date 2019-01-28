package Online.Variabeles.ControlFlow;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the  starting point ");
        n = s.nextInt();
        System.out.println("Enter the ending point ");
        m = s.nextInt();
        isPrimeNo(n, m);
    }

    public static void isPrimeNo(int n, int m) {
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + "is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop ");
                    break;
                }
            }

        }

    }

    public static boolean isPrime(int i) {
        if (i == 1) {
            return false;
        }
        for (int j = 2; j <=i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}

