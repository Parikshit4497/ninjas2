package RevisionCodingNinjas.Recursion1a;

import java.util.Scanner;

public class GeometricSum {
    public static double geoMetricsum(int k){
        if(k==0){
            return 1;
        }
        return  geoMetricsum(k-1)+1/Math.pow(2,k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;
        k=sc.nextInt();
        System.out.println("The gemoetric sum is" + geoMetricsum(k));
        sc.close();
    }
}
