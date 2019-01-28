package OopsPackage;

import java.util.Scanner;

public class OverloadDistance {
    public static void main(String[] args) {
        double feet ;
        double inches ;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the distance in feet :");
        feet=s.nextDouble();
        System.out.println("Enter the distance in inches:");
        inches=s.nextDouble();
        double centimeters=calculateMeasurement(feet,inches);
        System.out.println("The distance in centimeters is:" + centimeters);
        System.out.println("Enter the number of inches:");
        inches=s.nextDouble();
        calculateMeasurement(inches);
    }
    public static  double calculateMeasurement(double feet,double inches)
    {
        double centimeter,newinches;
        if(feet>=0&&(inches>=0&&inches<=12)) {
            newinches = feet * 12;
            centimeter = newinches * 2.54 + inches * 2.54;
            return centimeter;
        }
        else {
            return -1;
        }
    }
    public static double calculateMeasurement(double inches)
    {
        if(inches>=0)
        {
            int     newFeet=(int )inches/12;
            int newInches=(int )inches%12;
            System.out.println("The distance is: " + newFeet+" feet "+newInches+" :inches");
            return  calculateMeasurement(newFeet,newInches);
        }
        else {
            return -1;
        }
    }
}
