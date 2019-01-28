package Stack;

import java.util.Stack;

/**
 * Created by hp on २६-०७-२०१७.
 */
import java.util.Scanner;
class ReverseStack
{
    public static Stack reverse(Stack st1,Stack st2)
    {
        int arr[]=new int[st1.size()];
        int i=0;
        int count=0;
        while(!st1.empty())
        {
            arr[i++]= (int) st1.pop();
            count++;
        }
        for(i=0;i<count;i++)
        {
            st2.push(arr[ i ]);
        }
        while(!st2.empty())
        {st1.push(st2.pop());
        }

        return st1;
    }
}
class stackCreate
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack st1 =new Stack();
        Stack st2 =new Stack();
        int n=0,i;
        ReverseStack r1=new ReverseStack();
        System.out.println("Enter the number of elements in first stack :");
        n=s.nextInt();
        int data=0;
        for( i=0;i<n;i++)
        {
            data=s.nextInt();
            st1.push(data);
        }
        System.out.println("Reversed stack");
        Stack st3=r1.reverse(st1,st2);
        System.out.println("The stack after reversing is " + st3);
    }
}
