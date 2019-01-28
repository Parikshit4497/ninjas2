package Lecture1; /**
 * Created by hp on १२-०६-२०१७.
 */
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        int x,n,s=1,i=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of the number:");
        x=input.nextInt();
        System.out.println("Enter the value of the power of the number which you wish to find:");
        n=input.nextInt();
        while(i<=n)
        {
            s=s*x;
            i++;
        }
        System.out.println("The value of the number is:" +s);




    }
}
