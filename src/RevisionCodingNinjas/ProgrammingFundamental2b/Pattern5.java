package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,k=0;
        int l=0,n=0,a=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            a=i;
            for(j=n;j>i;j--){
                System.out.print("  ");
            }
            for(k=1;k<i;k++){
                System.out.print(a+" ");
                a++;
            }
            for(l=i;l>=1;l--){
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }

    }
}
