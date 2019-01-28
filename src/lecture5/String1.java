package lecture5;

import java.util.Scanner;

/**
 * Created by hp on १७-०६-२०१७.
 */
public class String1 {
    public static void main(String[] args) {
        String name;
        int i=0;
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the string :");
        name=input.next();
        while(i<name.length())
        {

            System.out.println(name.charAt(i));
            i++;
        }

    }
}
