package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class NumberPattern6SingleLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,k=0,d=0,a=1,n=0;
        n=sc.nextInt();
        d=n;
        for(i=1;i<=n;){
            if(k<d){
                System.out.print(" ");
                k++;
                continue;
            }else{

                if(j<i){

                    System.out.print(a+" ");
                    a++;
                    j++;
                    continue;
                }else{
                    j=0;
                    k=0;
                    i++;
                    a=i;
                    System.out.println();
                }
                d--;
            }

        }

    }
}
