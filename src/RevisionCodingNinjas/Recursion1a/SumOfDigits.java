package RevisionCodingNinjas.Recursion1a;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int number){
        if(number==0){
            return 0;
        }
        return sumOfDigits(number/10)+number%10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        System.out.println("The sum of digits is"+sumOfDigits(number));

        sc.close();
    }
}
