package StringsAnd2dArray;

import java.util.Scanner;

/**
 bv Created by hp on २२-०६-२०१७.
 */
public class MinimumLengthWord {
    public static void main(String[] args) {
        String input;
        String str12 = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        input = s.nextLine();
        str12 = minLengthWord(input);
        System.out.println("The minimum length word is " + str12);

    }

    public static String minLengthWord(String input) {

        String str = "", str1 = "";
        char ch = 32;
        int i = 0, j = 0, k = 0, min = Integer.MAX_VALUE, startindex = 0,endindex=0;
        for (i = 0; i <= input.length(); ) {
            j=0;
            while(i<input.length()&&input.charAt(i) !=ch) {

                    j = j + 1;
                 i++;
            }

                if (min > j) {
                    min = j;
                    startindex = k;
                    endindex = i;
                }
            k = i;
            i++;
        }




     str=input.substring(startindex,endindex);
        return str;
    }

    }
