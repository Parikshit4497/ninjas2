package RevisonComp;

import java.util.Scanner;

public class NumberPattern1 {
    public static void main(String[] args) {
        int n;
        int i;
        int j;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print(1);
            }
            System.out.println();

        }
    }
}
