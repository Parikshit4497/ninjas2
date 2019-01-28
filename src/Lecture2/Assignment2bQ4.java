package Lecture2; /**
 * Created by hp on १२-०६-२०१७.
 */
import java.util.Scanner;
public class Assignment2bQ4 {
    public static void main(String[] args) {
        int num,a,b,c=1,sum1=0,sum2=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        num=input.nextInt();
        while(num>0)
        {
            a=num%2;
            sum1=  sum1 + a*c ;
            c=c*10;
            num=num/2;
        }

        System.out.println("The number after conversion from decimal to binary :"+ sum1);


    }
}
