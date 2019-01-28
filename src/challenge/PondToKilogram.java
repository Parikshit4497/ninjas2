package challenge;

import java.util.Scanner;

/**
 * Created by hp on २५-०८-२०१७.
 */
public class PondToKilogram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of pounds :");
        double pound=s.nextFloat();
        double kilogram=pound*0.45359237;
        System.out.println("The  number of kilogram in th given number of pounds:" +kilogram);

    }
}
