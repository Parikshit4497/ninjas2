package OOPSBOOK;

/**
 * Created by hp on २२-०८-२०१७.
 */
public class Conversions {
    public static void main(String[] args) {
        byte b=0;
        int i=257;
        double d=323.142;
        System.out.println("i and b before conversion: of i to Byte: " + i + " "+ b );
         b=(byte)i;
        System.out.println("i and b after conversion:" + i+ " "+ b);
        System.out.println("i and d before conersion of Double d to Int i:");
        System.out.println("i:"+ i + " d:" +d);
        i=(int)d;
        System.out.println("i:" + i +"d: "+ d);
        System.out.println("Conversion of Double to Byte");
        b=(byte)d;
        System.out.println(" d and b : "+ d +" "+ b);
       }
}





