package Stack;

import java.util.Scanner;

/**
 * Created by hp on २२-०७-२०१७.
 */
public class QueueUsinLinkList{
    Node enqueue=null;
    Node dequeue=null;
    void Eneqeue(int data )
    {
                Node newNode =new Node(data);
                if(enqueue==null)
                {
                    enqueue=newNode;
                    dequeue=newNode;
                }
                else
                {
                   enqueue.next=newNode;
                   enqueue=newNode;
                }

    }
    int  Dequeue()
    {
        int data=dequeue.data;
        dequeue = dequeue.next;
        if (dequeue==null) {
            System.out.println("The queue is empty");
        }
        return data;
    }
}
class QueueUseage1
{
    public static void main(String[] args) {
        QueueUsinLinkList obj1 = new QueueUsinLinkList();
        System.out.println("Enter the option you wish to choose");
        System.out.println("1:Enqueue");
        System.out.println("2:Dequeue");
        System.out.println("3:Exit");

        while(2>1)
        {System.out.println("Enter the option you wish to choose");

            Scanner s =new Scanner(System.in);
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter the data you wish to insert");
                    obj1.Eneqeue(s.nextInt());
                    break;
                case 2:
                    System.out.println("The data that is dequed is " + obj1.Dequeue());
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }

    }
}
