package StringsAnd2dArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hp on २५-०६-२०१७.
 */
public class HighestOccurringChar {
    public static void main(String[] args) {
        String inputString = "";
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string :");
        inputString = s.nextLine();
        ch = highestOccuringCharacter(inputString);
        System.out.println("The highest occurring character is:" + ch);
    }

    public static char highestOccuringCharacter(String inputString) {
        char ch1='\u0000';
        int i, j=0,k=1;
        int max = Integer.MIN_VALUE;
        char cha[]=inputString.toCharArray();
        Arrays.sort(cha);
       loopname:for (i = 0; i < cha.length-1; i++) {

           if (cha[i] == cha[i + 1]) {
               k++;  j++;
           }
           else if(cha[i]!=cha[i+1])
           {
               if (k > max) {
                   max=k;
                   ch1 = cha[j];
                   k=1;
               } else {
                   continue loopname;
               }
           }



       }

        return ch1;
    }
}


