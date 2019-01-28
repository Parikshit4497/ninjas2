package Online.Variabeles.ExpressionExcercise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year ;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year that you wish to check ");
        year=s.nextInt();

        System.out.println("The year you print is a leap year:"+ isLeapYear(year));
    }
    public static  boolean isLeapYear(int year)
    {
        if(year<0||year>9999)
        {
            return false;
        }
        else{
            if((year%4==0||year%400==0)&&year%100!=0)
            {
                return true;
            }
            else{
                return false;
            }


        }
    }
}
