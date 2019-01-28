package RevisonComp;

import java.util.Scanner;

public class NumerPattern2 {
    public static void main(String[] args) {
        int n;
        int i;
        int j;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for( i=0;i<n;i++){
            if(i<2){
                if(i==0){
                    System.out.print(1);
                    System.out.print("\n");
                }else{
                    System.out.print(1);
                    System.out.print(1);
                    System.out.print("\n");
                }
            }
            else{
            for(j=0;j<=i;j++) {
                if (i == 1) {
                    System.out.print(1);
                } else if (j == 0 || j == i) {
                    System.out.print(i);
                } else {
                    System.out.print(0);
                }
            }
                System.out.println();
            }

        }
    }
}
