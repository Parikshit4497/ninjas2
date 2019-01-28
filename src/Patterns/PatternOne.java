package Patterns;

public class PatternOne {
    public void PrintPattern(int n) {
        int i, j;

        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }

    public void printPattern2(int n) {

        int i, j;
        int k = 0;
        for (i = 0; i <= n; i++) {
            for (j = 0; j < i; j++) {
                k = i - 1;
                if (i == 1) {
                    System.out.print(1);
                } else if (j == 0 || j == i - 1) {
                    System.out.print(k);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        PatternOne o1 = new PatternOne();
        o1.PrintPattern(5);
        o1.printPattern2(5);
    }
}
