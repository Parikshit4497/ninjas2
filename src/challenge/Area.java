package challenge;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double area,length,breadth;
        float radius;
        System.out.println("Enter the length of each side of the square");
        length=s.nextDouble();
        area=areaCalc(length);
        System.out.println("The area of the square is: "+ area);
        System.out.println("Enter the length of the rectangle:");
        length=s.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth=s.nextDouble();
        area=areaCalc(length,breadth);
        System.out.println("The  area of the rectangle is:"+ area );
        System.out.println("Enter the radius of the circle ");
        radius=s.nextFloat();
        area=areaCalc(radius);
        System.out.println("The area of the circle is "+ area);
    }
    public static double areaCalc(double length)
    {

        return length*length;
    }
    public static double areaCalc(double length,double breadth)
    {
        return length*breadth;
    }
    public static double areaCalc(float radius )
    {
        return radius*radius*3.1413;
    }
}
