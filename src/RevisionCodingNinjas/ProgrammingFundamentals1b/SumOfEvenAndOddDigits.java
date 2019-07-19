package RevisionCodingNinjas.ProgrammingFundamentals1b;

import java.util.Scanner;

public class SumOfEvenAndOddDigits {
    public static void main(String[] args) {
        int number=0;
        int sumOfEven=0;
        int sumOfOdd=0;
        int a=0;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        while(number>0){
            a=number%10;
            if(a%2==0){
                sumOfEven+=a;
            }else{
                sumOfOdd+=a;
            }
            number=number/10;
        }
        System.out.println(sumOfEven+" "+sumOfOdd);
    }
}
