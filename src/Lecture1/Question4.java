package Lecture1; /**
 * Created by hp on १२-०६-२०१७.
 */
import java.io.PrintStream;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        double a,b,c ,d;
        String x1 = null,x2=null;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the first coeffecient of the quadratic equation: ");
    a=input.nextDouble();
    System.out.println("Enter the second coeffecient of the quadratic equation: ");
    b=input.nextDouble();
    System.out.println("Enter the third coeffecient of the quadratic equation :");
    c=input.nextDouble();
    d=b*b-8*a*c;
    if(d>=0)
    {
        x1=String.valueOf(((-b)+(Math.sqrt(d)))/4*a);
        x2= String.valueOf(((-b)-(Math.sqrt(d)))/4*a);
    }
    else if(d<0)
    {
     x1=String.valueOf((-b)/(4*a))+"+"+ String.valueOf((Math.sqrt(Math.abs(d)))/(4*a))+"+i";
     x2=String.valueOf((-b)/(4*a))+"-"+ String.valueOf((Math.sqrt(Math.abs(d)))/(4*a))+"+i";

    }
        final PrintStream printf;
        printf = System.out.printf("Roots are =%sand%s%n", x1, x2);
        if(d>0)
    {
        System.out.println("roots are real and unequal");
    }
    else if(d<0) {
        System.out.println("Roots are imaginary ");
    } else
    {
        System.out.println("Roots are real and equal: ");
    }


    }
}
