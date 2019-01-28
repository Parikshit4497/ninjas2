package RevisionCodingNinjas;
import  java.util.Scanner;
public class CharCase {
    public static void main(String[] args) {
        char ch;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the character ");
        ch=s.nextLine().charAt(0);
        if(ch>=65 &&ch<=90)
        {
            System.out.println("The character you entered is an upper case letter ");
        }
        else{
            System.out.println("The character you entered is lower case letter ");
        }
    }
}
