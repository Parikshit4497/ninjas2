package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class NumberPattern2SingleLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        int n=0;
        n=sc.nextInt();
        for(i=0;i<n;){
            if(i<2){
                if(i==0){
                    System.out.print(1);
                    System.out.print("\n");
                   i++ ;
                }else{
                    System.out.print(1);
                    System.out.print(1);
                    System.out.print("\n");
                    i++;
                }}else{
                    if(j==0||j==i){
                        System.out.print(1);
                        j++;
                        continue;
                    }else if(j<=i) {
                        System.out.print(2);
                        j++;
                    }else{
                        j=0;
                        i++;
                        System.out.println();
                    }
                }
            }
        }
    }

