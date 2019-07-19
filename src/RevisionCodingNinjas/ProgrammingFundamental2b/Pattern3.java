package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        int k=0,l=0,a=1;
        int n=0;
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=n;j>i;j--){
                System.out.print(" ");
            }
            for(k=0;k<i;k++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
