package RevisonComp;

import java.util.Scanner;

public class NumberPatternSingleLoop7 {
    public static void main(String[] args) {
        int i;
        int j = 0;
        int k = 0;
        int l = 0;
        int d;
        int a = 0;
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        d = n;
        for(i=0;i<=n;){

            if(k<d){

                System.out.print(" ");
                k++;
                continue;
            }else{

                if(j<=i){
                    a++;
                    System.out.print(a);
                    j++;
                    continue;
                }else{
                    j=0;
                    k=0;
                    d--;
                    i++;
                    a=i;
                    System.out.print("\n");
                }

            }
        }
    }

}
