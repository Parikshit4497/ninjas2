package RevisonComp;

import java.util.Scanner;

public class NumberPatternSingleLoop5 {
    public static void main(String[] args) {
        int n;
        int i;
        int j=0;
        int k=0;
        int d;
        int a=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        d=n;
        for(i=0;i<n;){
            if(k<d){
                System.out.print(" ");
                k++;
                continue;
            }else{

                if(j<=i){
                    System.out.print(a+" ");
                    j++;
                    a++;
                    continue;
                }
                else{
                    i++;
                    j=0;
                    a=1;
                    System.out.println();
                }
                k=0;
                d--;
            }
        }
    }
}
