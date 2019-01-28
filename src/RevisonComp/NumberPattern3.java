package RevisonComp;

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        Scanner s=new Scanner(System.in);
        n =s.nextInt();
        for(i =0;i<n;i++)
        {
            if(i<2)
            {
                if(i==0) {
                    System.out.print(1);
                    System.out.print("\n");
                }
                else{
                    System.out.print(1);
                    System.out.print(1);
                    System.out.print("\n");
                }
            }else{
                for(j=0;j<=i;j++) {
                    if (j == 0 || j == i) {
                        System.out.print(1);
                    } else {
                        System.out.print(2);
                    }
                }
                System.out.print("\n");
            }

        }
    }
}
