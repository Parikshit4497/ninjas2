package Recursion1;


import java.util.Scanner;

public class GeometricSum {
    public static void main(String[] args) {
        int  k;
        double num = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number whose geometric sum you wish to find out ");
        k = s.nextInt();
        num = findGeometricSum(k);
        System.out.println("The geometric sum is:" + num);

    }
        public static double findGeometricSum(int k)
        {
            if(k==0)
            {
                return 1;
            }

            return findGeometricSum(k-1)+1/Math.pow(2,k);
        }

    }

