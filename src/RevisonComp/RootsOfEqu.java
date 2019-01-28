package RevisonComp;

import java.util.Scanner;

public class RootsOfEqu {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float D;
        double x;
         double y;
        Scanner s=new Scanner(System.in);
        a=s.nextFloat();
        b=s.nextFloat();
        c=s.nextFloat();
        D=b*b-4*a*c;
        x=(-b+Math.pow(D,0.5))/2;
        y=(-b-Math.pow(D,0.5))/2;
        if(D>0){
            System.out.println(1);
            System.out.println("The first root is:" +x+"the second root is " +y);
        }else if(D==0){
            System.out.println(0);
            System.out.println("It has two roots at the same point" +"x "+x+"y" +y);
        }
        else if(D<0){
            System.out.println(-1);
            System.out.println("It has imaginary roots ");
        }
    }
}
