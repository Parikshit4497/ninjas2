package Online.Variabeles.ExpressionExcercise;

import java.util.Scanner;

public class ThreeDecimal {
    public static void main(String[] args) {
        double number1;
        double number2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number ");
        number1=s.nextDouble();
        System.out.println("Enter the second number");
        number2=s.nextDouble();
        System.out.println("Are the two numbers equal to 3 decimal places:"+ areEqualByThreeDecimalPlaces(number1,number2));
    }
    public  static  boolean areEqualByThreeDecimalPlaces(double number1,double number2) {
              int xnumber1;
              int xnumber2;
              xnumber1=(int)(number1*1000);
              xnumber2=(int)(number2*1000);
              int result=xnumber1-xnumber2;
              if(Math.abs(result)>=1)
              {
                  return false;
              }
              else{
                  return true;
              }

    }
}
