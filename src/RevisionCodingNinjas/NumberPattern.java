package RevisionCodingNinjas;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        int n=0;
        int i=0,j=0,a=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            a=i;
            for(j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
