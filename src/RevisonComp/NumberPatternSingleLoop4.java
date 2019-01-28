package RevisonComp;

import java.util.Scanner;

public class NumberPatternSingleLoop4 {
    public static void main(String[] args) {
        int n ;
        int i;
        int j=0;
        int a=0;
        int d=0;
        int k=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        d=n;
         for(i=1;i<n;) {
             if (k < d) {
                 System.out.print(" ");
                 k++;
                 continue;
             } else  {
                 if(j<i){
                 System.out.print(i+" ");
                 j++;
                 continue;
             }else {
                     j = 0;
                     i++;
                     System.out.println();
                 }

                 d--;
                 k = 0;

         }



        }
    }
}

