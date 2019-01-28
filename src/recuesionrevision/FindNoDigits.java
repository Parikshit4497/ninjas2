package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ०९-०८-२०१७.
 */
public class FindNoDigits {
    public int countNo(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return 1+countNo(n/10);
    }
}
class FindDigits
{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        FindNoDigits f1=new FindNoDigits();
        System.out.println("Enter the number ");
        int n=s1.nextInt();
       int result= f1.countNo(n);
        System.out.println("The number of digits in the number is : " + result);


    }

}
