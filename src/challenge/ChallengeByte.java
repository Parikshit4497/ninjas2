package challenge;

/**
 * Created by hp on २३-०८-२०१७.
 */
public class ChallengeByte {
    public static void main(String[] args) {
        byte m=10;
        short n=1000;
        int l=100000;
        long result =5000L+10L*(m+n+l);
        System.out.println("The result is: " + result);
        short shortresult=(short) (1000 + 10*(m+n+l));
        System.out.println("The shortresult is: " + shortresult );
        float f1=(float)5.4 ;
        double f2=5.666d;
        int m1=5/3;
        float a1=5f/3f;
        double a2=5d/3d;
        System.out.println("intvalue: " + m1 );
        System.out.println("my floatvalue: "+ a1);
       System.out.println("my doublevalue: " + a2);


    }
}
