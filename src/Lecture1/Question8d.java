package Lecture1; /**
 * Created by hp on १२-०६-२०१७.
 */
import java.util.Scanner;
public class Question8d {
    public static void main(String[] args) {
        int i,j,a=1,n;
        System.out.println("Enter the number of rows:");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=n;i>=1;i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("\n");
        }
   }
    }

