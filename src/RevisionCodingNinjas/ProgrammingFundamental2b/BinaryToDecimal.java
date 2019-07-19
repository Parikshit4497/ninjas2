package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal=0,binary=0,a=0,i=0;
        binary=sc.nextInt();
        while(binary!=0){
            a=binary%10;
            decimal= (int) (decimal +a*Math.pow(2,i));
            i++;
            binary=binary/10;
        }
        System.out.println("The decimal number is" +decimal);
    }
}
