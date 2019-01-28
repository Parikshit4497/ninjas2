package Stack;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 * Created by hp on २४-०७-२०१७.
 */
public class BalancedBrackets {
    int top;
    int arr[];

    BalancedBrackets() {
        top = -1;
        arr = new int[ 10 ];
    }

    void grow() {
        arr = new int[ 2 * arr.length ];
    }

    void push(int data) {
        if (top == arr.length - 1) {
            grow();
        } else {
            if(top==-1)
            {
                arr[++top]=data;
            }

            else if(arr[top]==40&&data==41)
            {
                pop();
            }
            else if(arr[top]==91&&data==93)
            {
                pop();
            }
            else if(arr[top]==123&&data==125)
            {
                pop();
            }
            else
            {
                arr[++top]=data;
            }

        }
    }

    void pop() throws EmptyStackException {
        if (top == -1) {
            throw new EmptyStackException();
        } else {
            int i=arr[top --];
        }
    }
    boolean result()
    {
       if(top==-1)
       {
           return true;
       }
       return false ;
    }

}

class stackuse
{  public static void main(String[] args) {
        BalancedBrackets b1 = new BalancedBrackets();
        String str1 = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string ");
        str1 = s.nextLine();
        int data;
        int i;
        for (i = 0; i < str1.length(); i++) {
            data = str1.charAt(i);
            if ((40 == data) || (data == 41) || (data == 91) || (data == 93) || (data == 123) || (data == 125)) {
                b1.push(data);
            }
        }
     boolean result= b1.result();
        System.out.println("The brackets in the string are balance :" + result );
    }
}
