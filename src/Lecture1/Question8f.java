package Lecture1; /**
 * Created by hp on १२-०६-२०१७.
 */
import java.util.Scanner;
public class Question8f {
    public static void main(String[] args) {
        int i,j,a=1,b=0,n;
        System.out.println("Enter the number of rows:");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=n;i>=1;i--) {
           if(i%2==0) {
               for (j = 1; j <= i; j++) {
                   System.out.print(b);
               }
               System.out.println("\n");
           }
               else
               {
                   for (j = 1; j <= i; j++) {
                       System.out.print(a);
                   }
                   System.out.println("\n");
               }
           }

        }
    }


