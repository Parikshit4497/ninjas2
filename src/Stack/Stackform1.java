package Stack;

/**
 * Created by hp on ०५-०८-२०१७.
 */
import java.util.Stack;
import java.util.Scanner;

public class Stackform1 {
    public static void main(String[] args) {
        FindRedunBracket f1 = new FindRedunBracket();
        String str1 = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string ");
        str1 = s.next();
        boolean result = f1.CheckRedundant(str1);
        System.out.println("The string does not contain redundant brackets:" + result);

    }
}
 class FindRedunBracket {
     public static boolean CheckRedundant(String str1) {
         int i;
                  Stack st1 = new Stack();
         for (i = 0; i < str1.length(); i++) {
             if (str1.charAt(i) != ')') {
                 st1.push(str1.charAt(i));
             } else if (str1.charAt(i) == ')') {
                 while ((char)st1.pop() != '(')
                 {

                 }
             }

         }
            if (st1.empty()) {
                return true;
            } else {
                return false;
            }

    }
}