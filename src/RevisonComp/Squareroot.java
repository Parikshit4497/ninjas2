package RevisonComp;

import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        int i,n,d=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        i=0;
        while(i*i<n){
            d=i;
           i++;
        }
        System.out.println(d);
    }
}
