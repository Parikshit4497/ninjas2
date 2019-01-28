package RevisonComp;

import java.util.Scanner;

public class NumberPatternSingleLoop3 {
    public static void main(String[] args) {
        int n;
        int i,j=0;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        for (i=0;i<n;){
            if(i<2){
                if(i==0){
                    System.out.print(1);
                    System.out.print("\n");
                    i++;
                }else{
                    System.out.print(1);
                    System.out.print(1);
                    System.out.print("\n");
                    i++;
                }
            }else{
                if(j==0||j==i){
                    System.out.print(1);
                    j++;
                    continue;

                }else if(j<=i){
                    System.out.print(2);
                    j++;
                    continue;
                }else{
                    j=0;
                    i++;
                    System.out.println();
                }
            }

        }
    }
}
