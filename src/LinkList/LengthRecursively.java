package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class LengthRecursively {

  static Node createlist()
{
    Node head=null;
    Node tail=null;
    int data;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number  ");
    data=s.nextInt();
    while(data!=-1)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
        System.out.println("Enter the data:");
        data=s.nextInt();
    }
    return head;
}
    static void printlist(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }
    static int length(Node head, int count)
    {     if(count==0)
          {
              return 0;
          }
        if(head!=null)
        {
            count++;
           return   length(head.next,count);
        }
        return count ;
    }

    public static void main(String[] args) {
        Node m1=createlist();
        printlist(m1);
        CalculateLength m2=new CalculateLength();
        int m=m2.length(m1,0);
        System.out.println("The length of the link list  is:" + m);

    }
}
