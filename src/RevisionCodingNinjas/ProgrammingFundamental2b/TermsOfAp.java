package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class TermsOfAp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=0,i=1,result,N=1;
        N=s.nextInt();
        for(i=0;i<N;){
            n++;
            result=3*n+2;
            if(result%4!=0){
                System.out.println(result);
                i++;
            }

        }
    }
}
