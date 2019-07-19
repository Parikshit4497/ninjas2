package RevisionCodingNinjas.ProgrammingFundamentals1b;

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        int n=0;
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){

            for(j=1;j<=i;j++){
                if(i==1){
                    System.out.print(1);
                }else if(j==1||j==i){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
