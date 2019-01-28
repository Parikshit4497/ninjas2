package RevisionDataStructure;

import java.util.Scanner;

public class meregtwosortedlist {
    static public Node createlist() {

        Node head = null;
        Node tail = null;
        int data;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data");
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
            System.out.println("Enter the data:");
            data=s.nextInt();
        }
        return head;
    }
    public static Node mergelist(Node head1,Node head2)
    {
        Node start;
        Node tail;
        if(head1.data<head2.data)
        {
            start=head1;
            tail=head1;
            head1=head1.next;
        }
        else
        {
            start=head2;
            tail=head2;
            head2=head2.next;
        }
        while(head1!=null&&head2!=null)
        {
            if(head1.data<head2.data)
            {
                tail.next=head1;
                head1=head1.next;
            }
            else
            {
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        tail.next=head1==null?head2:head1;
        return start;
    }
    static void printlist(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Node m=createlist();
        System.out.println("the list after printing is:");
        printlist(m);
        Node m1=createlist();
        System.out.println("the list after printing is:");
        printlist(m1);
        Node head1=m;
        Node head2=m1;
        System.out.println("The list after punching the two list is:");
       Node m3=mergelist(head1,head2);
        printlist(m3);
    }

}
