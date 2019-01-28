package codzen;

import java.util.Scanner;

/**
 * Created by hp on १६-०६-२०१७.
 */
public class FactTraiZero {
    public static void main(String[] args) {
        int n;
        int currentPow=5;
        int numfives=0;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();

        while(currentPow<=n)
        {

            numfives+=n/currentPow;
            currentPow=currentPow*5;
        }
        System.out.print(numfives);
    }
}
