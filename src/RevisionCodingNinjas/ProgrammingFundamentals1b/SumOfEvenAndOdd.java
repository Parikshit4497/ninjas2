package RevisionCodingNinjas.ProgrammingFundamentals1b;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int sumOdd=0;
        int sumEven=0;
        int number =0;
        int i=1;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        while(number>0){

            if(i%2==0){
                sumEven+=number%10;
            }else if(i%2==1){
                sumOdd+=number%10;
            }
            i++;
            number=number/10;
        }
        System.out.println("The sum of even digits is " +sumEven);
        System.out.println("The sum of odd digits is " +sumOdd);
    }
}
