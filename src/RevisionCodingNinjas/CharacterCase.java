package RevisionCodingNinjas;

import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {
        int ch;
        Scanner sc= new Scanner(System.in);
        ch=(int)sc.next().charAt(0);
        if(ch>=65&&ch<=90){
            System.out.println("Upper case");
        }else if(ch>=97&&ch<=122){
            System.out.println("Lower Case");
        }else{
            System.out.println("Invalid Charachter");
        }

    }
}
