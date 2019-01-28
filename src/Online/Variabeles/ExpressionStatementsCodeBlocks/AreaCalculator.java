package Online.Variabeles.ExpressionStatementsCodeBlocks;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        float radius ;
        float length ;
        float breadth;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the radius ");
        radius=s.nextFloat();
        if(area(radius)==-1)
        {
            System.out.println("The parameter you entered is invalid");
        }
        else{
            System.out.println("The area of the circle" + area(radius));
        }
        System.out.println("Enter the length of the rectangle");
        length=s.nextFloat();
        System.out.println("Enter the breadth  of the rectangle");
        breadth=s.nextFloat();
        if(area(length,breadth)==-1)
        {
            System.out.println("The parameter is invalid");
        }
        else{
            System.out.println("The area of the rectangle is:" +area(length,breadth));
        }
    }
    public static double area(float radius)
    {
        if(radius<0)
        {
            return -1;
        }
        else{
            return 3.143*radius*radius;
        }
    }
    public static double area(float length,float breadth)
    {
        if(length==-1||breadth==-1)
        {
            return -1;
        }
        else{
            return length*breadth;
        }
    }
}
