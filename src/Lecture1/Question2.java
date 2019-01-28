package Lecture1;

import java.util.Scanner;

/**
 * Created by hp on १४-०६-२०१७.
 */

public class Question2 {
    public static void main(String[] args) {
        char ch;
        Scanner input_char = new Scanner(System.in);
        System.out.println("Enter the character :");
        ch = input_char.next().charAt(0);

        if (ch >= 65 && ch <= 90) {
            System.out.println("The character is an uppercase letter :");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("The character is a lowercase letter:");
        }
    }
}