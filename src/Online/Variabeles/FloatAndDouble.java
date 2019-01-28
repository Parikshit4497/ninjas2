package Online.Variabeles;

import java.util.Scanner;

public class FloatAndDouble {
    public static void main(String[] args) {
        int myIntValue=5/3;
        float myFloatValue=5f/3f;
        double myDoubleValue=5d/3d;
        float mypound;
        Scanner s=new Scanner(System.in);
        System.out.println("myIntValue=" +myIntValue);
        System.out.println("myFloatValue=" +myFloatValue);
        System.out.println("myDoubleValue="+myDoubleValue);
        System.out.println("Enter the number of pounds ");
        mypound=s.nextFloat();
        double myKilograms=mypound*0.453592;
        System.out.println("The weight in kilograms is :"+ myKilograms);

    }
}
