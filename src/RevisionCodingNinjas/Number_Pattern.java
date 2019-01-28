package RevisionCodingNinjas;

import java.util.Scanner;
public class Number_Pattern {
    public static void main(String[] args) {
        int n;
        int a=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}
