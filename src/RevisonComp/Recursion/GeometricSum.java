package RevisonComp.Recursion;

import java.util.Scanner;

public class GeometricSum {
    public static double geomtricSum(int k){
        if(k==0){
            return 1;
        }
        return   geomtricSum(k-1)+ 1/Math.pow(2,k);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        double result=geomtricSum(k);
        System.out.println("The result is " + result );
    }
}
