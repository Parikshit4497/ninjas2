import java.util.Scanner;

/**
 * Created by hp on २१-०६-२०१७.
 */
public class PowerOfNumber
{
    public static void main(String[] args) {
        int n, x,d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = s.nextInt();
        System.out.println("Enter the power");
        n = s.nextInt();
          d= power(x,n);
     System.out.println("The number is "+ d);
    }
        public static int power(int x, int n) {
          int g=1,i=0;
          if(n==0)
          {
              return 1;
          }
          if(n==1)
            {
                return x;

            }
          return  x*power(x,n-1);
        }

}
