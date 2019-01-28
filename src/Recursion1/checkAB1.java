package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on ०५-०७-२०१७.
 */
public class checkAB1 {
    public static void main(String[] args) {
        String input;
        boolean b;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string ");
        input = s.next();
        int flag[] = new int[ input.length()-1 ];
        b = find(input, flag, 0);
        System.out.println("The string is written correctly " + b);
    }
    public static  boolean find(String input,int flag[],int i) {
        char ch = 32;
        int k=0;
        boolean b=false;
        if (input.charAt(0) != 'a') {
            return false;
        }

        if (input.charAt(0) == 'a' & i <input.length()-1) {
            if (input.charAt(i) == 'a' & input.charAt(i + 1) == 'a') {
                flag[ i ] = 1;
                find(input, flag, i + 1);
            } else if (input.charAt(i) == 'a' & input.charAt(i + 1) == ch) {
                flag[ i ] = 1;
                find(input, flag, i + 1);
            } else if((input.charAt(i) == 'a' & input.charAt(i + 1) == 'b')) {
                flag[ i ] = 1;
                find(input, flag, i + 1);

            } else if (input.charAt(i) == 'b' & input.charAt(i + 1) == 'b') {
                flag[ i ] = 1;
                find(input, flag, i + 1);
            } else if (input.charAt(i - 1) == 'b' & input.charAt(i) == 'b') {
                if (input.charAt(i + 1) == 'a') {
                    flag[ i ] = 1;
                    find(input, flag, i + 1);
                } else if (input.charAt(i + 1) == ch) {
                    flag[ i ] = 1;
                    find(input, flag, i + 1);
                }
            } else {
                flag[ i ] = 0;
            }
        }

        for(int j=0;j<flag.length;j++)
        {
            if(flag[j]==1)
            {
                b=true;
            }
            else
            {
                b=false;
                break;
            }

        }
        return b;
    }
}
