package RevisionCodingNinjas;

import java.util.Scanner ;
public class NumberPattern {
    public static void main(String[] args) {
        int n;
        int i ,a=0;
        int j,k;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        n=s.nextInt();

        for(i=0;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            a=i;
            for(k=0;k<i;k++)
            {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}
