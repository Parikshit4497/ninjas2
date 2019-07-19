package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class NumberPattern3SingeLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,k=0;
        int j=0,d=0;
        int n=0;
        n=sc.nextInt();
        d=n-1;
        for(i=1;i<n;){
            if(k<d){
                System.out.print(" ");
                k++;
                continue;
            }else{
                if(j<i){
                    System.out.print(i +" ");
                    j++;
                    continue;
                }else{
                    j=0;
                    i++;
                    System.out.println();
                }
            }
            k=0;
            d--;

        }



    }
}
