package OOPSBOOK;

import java.util.Scanner;

/**
 * Created by hp on २१-०८-२०१७.
 */
public class Area {
    public static void main(String[] args) {
        double pi,r,s,area;
        Scanner s1=new Scanner(System.in);
        pi=3.14141;
        System.out.println("Enter the radius of the circle:");
        r=s1.nextDouble();
        s=2*pi*r;
        area=pi*r*r;
        System.out.println("The circumfrence of the circle is: " + s);
        System.out.println("The area of the circle is: " + area);

    }
}
