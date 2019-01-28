package Stack;
import java.util.Stack;
import java.util.Scanner;
public class BalancedBrackets1 {
 public static boolean checkRedundant(String str1)
 {
     Stack s1 =new Stack();
     int i=0;
     char p;
     for(i=0;i<str1.length();i++) {
         if (str1.charAt(i) == '{' || str1.charAt(i) == '[' || str1.charAt(i) == '(') s1.push(str1.charAt(i));
         else {
             p = (char) s1.pop();
             if (p == '{' && str1.charAt(i) == '}') {
                 continue;
             } else if (p == '[' && str1.charAt(i) == ']') {
                 continue;
             } else if (p == '(' && str1.charAt(i) == ')') {
                 continue;

             }
         }
     }
         if(s1.empty())
         {
             return true;
         }
         else
         {
             return false;
         }



 }


}
class BalancedsUse
{
    public static void main(String[] args) {
    Scanner s =new Scanner (System.in);
    BalancedBrackets1 b1= new BalancedBrackets1();
    System.out.println("Enter the string");
        String str1=s.next();
     boolean ans=   b1. checkRedundant(str1);
        System.out.println("Does the string contain balanced brackets " + ans);

    }
}
