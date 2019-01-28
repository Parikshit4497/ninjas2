package challenge;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
      double feet;
      double inches;
       Scanner s =new Scanner(System.in);
        System.out.println("Enter the distance in feet so that it can be converted to centimeter:");
        feet=s.nextDouble();
        System.out.println("Enter the distance in inches to convert to centimeters: ");
       inches=s.nextDouble();
         double centimeter=calculateMeasurement(feet,inches);
        System.out.println("The distance in centimeters is: " + centimeter);
        System.out.println("Enter the distance in inches:");
        inches=s.nextDouble();
        calculateMeasurement(inches);
    }
    public static double calculateMeasurement(double feet,double inches)
    {
        if(feet>=0&&(inches>=0&&inches<=12))
        {
            double newinches=12*feet;
            double centimeter=newinches*2.54+inches*2.54;
            return centimeter;
        }else {
            return -1;
        }

    }
    public static double calculateMeasurement(double inches)
    {
        if(inches>=0)
        {
            int  newFeet=(int)inches/12;
            double newInches=inches%12;
            System.out.println("The distance is " + newFeet+" feet " + newInches+" inches" );
            return calculateMeasurement(newFeet,newInches);
        }
        else {
            return -1;
        }
    }
}
