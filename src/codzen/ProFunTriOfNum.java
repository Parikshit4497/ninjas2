package codzen;
import java.util.Scanner;
/**
 * Created by hp on १६-०६-२०१७.
 */
public class ProFunTriOfNum {
    public static void main(String[] args) {
     int i ,j,k,l;
     int n,a,space;
     Scanner input=new Scanner(System.in);
     System.out.println("Enter the naumber of rows in the pattern :");
     n=input.nextInt();
        space=n;
     for(i=0;i<n;i++)
     {
         a=i;
         for(j=0;j<space;j++)
         {
             System.out.print(" ");
         }
         space --;
         for(k=0;k<=i;k++)
         {       a++;
             System.out.print(a);

         }
         for(l=0;l<i;l++)
         {
             a--;
             System.out.print(a);

         }
         System.out.print("\n");
     }
    }
}
