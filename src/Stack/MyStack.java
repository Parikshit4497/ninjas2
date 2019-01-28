package Stack;


import java.util.Scanner;

/**
 * Created by hp on १८-०७-२०१७.
 */
public class MyStack {
    private void createstack()
    {

        int data;
        Node top=null;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the data");
        data=s.nextInt();
        while(data!=-1)
        {
            Node newNode =new Node(data);
            if(top==null)
            {
                top=newNode;
            }
            else
            {
                newNode.next=top;
                top=newNode;
            }
        }
    }
}
