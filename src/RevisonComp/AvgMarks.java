package RevisonComp;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        int m1;
        int m2;
        int m3;
        char name;
        int total;
        Scanner s=new Scanner(System.in);
        name=s.next().charAt(0);
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        total=(int)(m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(total);
    }
}
