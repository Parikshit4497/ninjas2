package codzen;

/**
 * Created by hp on १६-०६-२०१७.
 */

    import java.util.Scanner;
    public class Solution1 {


        public static void main(String[] args) {
            int n,i,j,k,a=0;
            Scanner input=new Scanner(System.in);
            n=input.nextInt();
            for(i=1;i<=5;i++)
            {
                a=n-i;
                for(j=0;j<i;j++)
                {
                    a++;
                    System.out.print(a);
                }
                for(k=j;k<n;k++)
                {
                    System.out.print(n);
                }
                System.out.print("\n");
            }



        }

    }


