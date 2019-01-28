package Lecture1;

/**
 * Created by hp on १५-०६-२०१७.
 */
import java.util.Scanner;
public class FtoC
{
    public static void main(String[] args) {
       int  c ,f;
       int i,n;
       int j;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the starting point of farhenite to celcius table");
       i=input.nextInt();
       System.out.println("Enter the Upper limit uptillwhich you fid the temperature:");
       n=input.nextInt();
       System.out.println("Enter the interval after which you wish to measure the temperature");
       j=input.nextInt();

       for(f=i;f<=n;f=f+j)
       {
           c=(int)((5.0/9)*(f-32));
           System.out.println(f+","+c);
       }
    }
}
