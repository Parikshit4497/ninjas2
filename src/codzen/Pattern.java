package codzen;

/**
 * Created by hp on १६-०६-२०१७.
 * 5432*
 * 543*1
 * 54*21
 * 5*321
 * *4321
 */
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int n,i,j,k,g,a,l;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=0;i<n;i++)
        {
            a=n;
            for(j=0;j<n-i-1;j++)
            {

                System.out.print(a);
                a--;
            }
            for(k=n-i-1;k<n-i;k++)
            {
                System.out.print("*");
            }
            g=i+1;
            for(l=n-i;l<n;l++)
            {
                g--;
                System.out.print(g);
            }
            System.out.print("\n");
        }
    }
}
