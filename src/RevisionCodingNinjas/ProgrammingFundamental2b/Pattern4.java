package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0,j=0;
        int k=0;
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
