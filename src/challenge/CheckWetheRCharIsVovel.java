package challenge;

import java.util.Scanner;

public class CheckWetheRCharIsVovel {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character");
        ch=s.next().charAt(0);
        switch(ch)
        {
            case 'A':
                System.out.println("Found A:");
                break ;
            case 'a':
                System.out.println("Found a:");
                break;
            case 'E':
                System.out.println("Found E:");
                break ;
            case 'e':
                System.out.println("Found e:");
                break;
            case 'I':
                System.out.println("Found I:");
                break ;
            case 'i':
                System.out.println("Found i:");
                break;
            case 'O':
                System.out.println("Found O:");
                break ;
            case 'o':
                System.out.println("Found 0:");
                break;
            case 'U':
                System.out.println("Found U:");
                break ;
            case 'u':
                System.out.println("Found u:");
                break;
                default:
                    System.out.println("The character you entered is a consonant:");
        }
    }
}
