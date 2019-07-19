package RevisionCodingNinjas.ProgrammingFundamentals1b;

import java.util.Scanner;

public class NumberPattern4 {
    public static void main(String[] args) {
        int n=0,i=0;
        int j=0,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
