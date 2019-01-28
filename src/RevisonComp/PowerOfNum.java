package RevisonComp;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        int n,m;
        int result=1;
        Scanner s=new Scanner(System.in);
         n=s.nextInt();
         m=s.nextInt();
        while(m>0){
            result=result*n;
            m--;
        }
        System.out.println("The raise to power of the number is:" + result);
    }
}
