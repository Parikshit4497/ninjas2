package RevisionCodingNinjas.String;

import java.util.Scanner;

public class NoOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input="";
        String splitArray[];
        input=sc.nextLine();
        splitArray=input.split(" ");
        System.out.println("Number of words " +splitArray.length);
        sc.close();
    }
}
