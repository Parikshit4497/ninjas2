package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,k=0;
        int n=0,a=1;
        n=sc.nextInt();
        for(i=0;i<n;i++){
            a=1;
            for(k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
}
