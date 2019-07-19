package RevisionCodingNinjas.ProgrammingFundamentals1b;

import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        int number=0;
        int power=0;
        int i=1;
        int result=1;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        power=sc.nextInt();
        while(i<=power){
            result=result*number;
            i++;
        }
        System.out.println("The power of the number is" + result);
    }
}
