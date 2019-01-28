package Online.Variabeles.ExpressionStatementsCodeBlocks;

import java.util.Scanner;

public class FeetInches {
    public static void main(String[] args) {
        double feet;
        double inches;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of feet");
        feet = s.nextDouble();
        System.out.println("Enter the number of inches");
        inches = s.nextDouble();
        if (calFeetandInchesToCentimeters(feet, inches) != -1) {
            System.out.println("The total centimeters in the given feet and inches is:" + calFeetandInchesToCentimeters(feet, inches));
        } else {
            System.out.println("Enter the field is invalid");
        }

        System.out.println("Enter the number of inches");
        inches = s.nextDouble();
        if (calFeetandInchesToCentimeters(inches) > 0)

        {
            System.out.println("The total number of centimeters in inches are:" + calFeetandInchesToCentimeters(inches));
        } else {
            System.out.println("Invalid number");
        }

    }


    public static double calFeetandInchesToCentimeters(double feet, double inches) {


        double totinch;
        double totcent;
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            totinch = feet * 12 + inches;
            totcent = totinch * 2.54;
            return totcent;
        } else {
            return -1;
        }
    }

    public static double calFeetandInchesToCentimeters(double inches) {
        double totfeet;
        double reminches;
        if (inches >= 0) {
            totfeet = inches / 12;
            reminches = inches % 12;

            return calFeetandInchesToCentimeters(totfeet,reminches);
        } else {
            return -1;
        }


    }

}
