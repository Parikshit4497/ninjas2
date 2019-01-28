package Lecture1; /**
 * Created by hp on १२-०६-२०१७.
 */
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        int num;
        int a;
        int sum1=0,sum2=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number the sum of whose even and odd digits you wish to find :");

        num=input.nextInt();
        while(num>0)
        {
            a=num%10;
            num=num/10;
            if(a%2==0)
            {
                sum1=sum1+a;
            }
            else
            {
                sum2=sum2+a;
            }
        }
        System.out.println("The sum of all even  numbers is: " + sum1);
        System.out.println("The sum of all odd numbers is:" +sum2);

    }

}
