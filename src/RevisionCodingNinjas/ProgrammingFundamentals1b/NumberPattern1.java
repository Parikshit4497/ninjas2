package RevisionCodingNinjas.ProgrammingFundamentals1b;

import java.util.Scanner;

public class NumberPattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int i=0,j=0;
         int n=0;
         n=sc.nextInt();
         for(i=1;i<=n;i++){
             for(j=1;j<=i;j++){
                 System.out.print(1);
             }
             System.out.println();
         }
    }
}
