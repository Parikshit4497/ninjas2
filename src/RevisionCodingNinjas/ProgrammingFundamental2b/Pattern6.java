package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,k=0,m=0,l=0,n=0;
        int no=0;
        n=sc.nextInt();
        if(n%2==0){
            no=n+1;
        }else{
            no=n;
        }
        for(i=0;i<(no/2+1);i++){
            for(j=(no/2+1);j>i;j--){
                System.out.print(" ");
            }for(k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=no/2;i>=1;i--){
            for(j=0;j<n/2-i+2;j++){
                System.out.print(" ");
            }
            for(k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
