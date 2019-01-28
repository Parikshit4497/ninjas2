package Recursion1;

import java.util.Scanner;

public class checkAB2 {
    public static void main(String[] args) {
        String input;
        boolean b;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string ");
        input = s.next();
        int flag[] = new int[ input.length()-1 ];
        b = find(input);
        System.out.println("The string is written correctly " + b);
    }
    public static boolean find(String input) {

        if (input.charAt(0) != 'a') {
            return false;
        }
        if (input.charAt(0) == 'a') {
            if (input.length() == 1) {
                return true;
            }
            if (input.length() > 2 && input.substring(1, 3).equals("bb")) {
                return find(input.substring(3));
            } else if (input.charAt(1) == 'a') {
                return find(input.substring(1));
            } else {
                return false;
            }
        }
        else
        {
            return  false ;
        }


    }
}
