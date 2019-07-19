package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal=0,binary=0;
        int a=0,c=1;
        decimal=sc.nextInt();
        while(decimal!=0){
            a=decimal%2;
            binary=binary+a*c;
            c=c*10;
            decimal=decimal/2;
        }

        System.out.println("Result " +binary);
    }
}
