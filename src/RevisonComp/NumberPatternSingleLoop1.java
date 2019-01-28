package RevisonComp;

import java.util.Scanner;

public class NumberPatternSingleLoop1 {
    public static void main(String[] args) {
        int n;
        int currentChar=0;
        int lineNo=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(lineNo=1;lineNo<=n;){
            if(currentChar<lineNo){
                System.out.print("*");
                currentChar++;
                continue;
            }
            if(currentChar==lineNo) {
                System.out.println();
                lineNo++;
                currentChar=0;

            }

        }

    }
}
