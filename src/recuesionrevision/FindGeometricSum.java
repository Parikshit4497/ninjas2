package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on १०-०८-२०१७.
 */
public class FindGeometricSum {
    public double result(int n)
    {
          if(n==0)
          {
              return 1;
          }
          return  (result(n-1) + 1/Math.pow(2,n));
    }

}
class GeometricSum
{
    public static void main(String[] args) {
        FindGeometricSum f1=new FindGeometricSum();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of terms upto which you wish to find the geometric sum:");
        int n=s.nextInt();
        double ans=f1.result(n);
        System.out.println("The result is :" + ans);
    }
}