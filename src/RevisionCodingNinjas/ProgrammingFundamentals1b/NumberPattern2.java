package RevisionCodingNinjas.ProgrammingFundamentals1b;

import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=0;
        int n=0;
        int k=0;
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){
              k=i-1;
                if(i==1){
                    System.out.print(1);
                }else if(j==0||j==i-1){
                    System.out.print(k);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
