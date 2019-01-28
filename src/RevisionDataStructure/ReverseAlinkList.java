package RevisionDataStructure;

import java.util.Scanner;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class ReverseAlinkList {
     static Node createList()
    {
          Node tail=null;
          Node head=null;
          int data ;
          Scanner s =new Scanner(System.in);
        System.out.println("Enter the data :");
        data=s.nextInt();
        while(data!=-1)
        {
            Node newNode=new Node(data);
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
            System.out.println("Enter the newnode");
            data=s.nextInt();
        }
        return head;
    }
    static Node reverse(Node head)
    {
        Node current=head;
        Node forward;
        Node prev=null;
        while(current!=null)
        {
            forward=current.next;
            current.next=prev;
            prev=current;
            current=forward;
        }
        return prev;
    }
    static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Node m1=createList();
        printList(m1);
        Node m2=reverse(m1);
        System.out.println("The list after reversing is");
        printList(m2);
    }
}
