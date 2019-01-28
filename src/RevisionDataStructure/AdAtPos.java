package RevisionDataStructure;

import java.util.Scanner;

/**
 * Created by hp on १३-०७-२०१७.
 */
public class AdAtPos {
    static Node createList()

    {
        int data;
        Node head = null;
        Node tail = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data:");
        data = s.nextInt();
        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            System.out.println("Enter the data :");
            data = s.nextInt();
        }

        return head;
    }

    static void printList(Node head)
    {
        if(head==null)
        {
            return ;
        }
        else
        {
            System.out.println(head.data);
            printList(head.next);
        }

    }
    static Node AddAtPos(Node head,int data1, int i)
    {
        int count=0;
        Node start=head;
        Node newNode1=new Node(data1);
        if(i==0)
        {
            newNode1.next=head;
        return newNode1;
        }
        while(count!=i-1)
        {
            head=head.next;
            count++;

        }
        Node temp=head;
        newNode1.next=temp.next;
        temp.next=newNode1;
        return start;
    }

    public static void main(String[] args) {
        Node m1=createList();
        printList(m1);
        int data1;
        int i;
        Scanner s1=new Scanner(System.in);
         System.out.println("Enter the number you wish to add");
         data1=s1.nextInt();
        System.out.println("Enter the position you wish to insert:");
        i=s1.nextInt();
        Node m2=AddAtPos(m1,data1,i);
        printList(m2);
    }
}
