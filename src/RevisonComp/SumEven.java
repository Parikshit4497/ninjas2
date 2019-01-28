package RevisonComp;

import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int N;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        while (i <=N) {
            if(i%2==0) {
                sum = sum + i;
                i++;
            }
        }
        System.out.println(sum);
    }
}
