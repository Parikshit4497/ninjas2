package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class NumberPattern1SingleLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lineNo=0,currentChar=0;
        int n=0;
        n=sc.nextInt();
        for(lineNo=1;lineNo<=n;){
            if(currentChar<lineNo){
                System.out.print("*");
                currentChar++;
                continue;
            } if (currentChar==lineNo){
                System.out.println();
                lineNo++;
                currentChar=0;
            }
        }

    }
}
