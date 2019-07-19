package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0,i=1,result=0;
        n=s.nextInt();
        while(i<n){
            if(i*i>n) {

                break;
            }
            i = i + 1;
        }
        System.out.println("The square root is" + (i-1));
    }
}
