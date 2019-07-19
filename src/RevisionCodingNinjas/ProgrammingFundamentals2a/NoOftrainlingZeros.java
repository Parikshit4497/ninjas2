package RevisionCodingNinjas.ProgrammingFundamentals2a;

import java.util.Scanner;

public class NoOftrainlingZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfFives=0;
        int currentPower=5;
        int number=0;
        number=sc.nextInt();
        while(currentPower<=number){
            numberOfFives+=number/currentPower;
            currentPower=currentPower*5;
        }
        System.out.println("The number of trailing zeroes is" +numberOfFives);

    }
}
