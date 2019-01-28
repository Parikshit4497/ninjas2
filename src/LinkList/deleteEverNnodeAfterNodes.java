package LinkList;

import java.util.Scanner;

/**
 * Created by hp on २०-०७-२०१७.
 */
public class deleteEverNnodeAfterNodes {
    static Node creatList() {
        Node head = null;
        Node tail = null;
        int data;
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
            System.out.println("Enter the data");
            data = s.nextInt();
        }
        return head;
    }
    static Node deletenafterm(Node head,int n,int g)
    {
        Node prev=head;
        Node forward=head;
        Node start=head;
        int count=0;
        while(forward!=null)
        {
            prev=forward;
            forward=forward.next;
            count++;
            if(count==g)
            {
                count=0;
                while(count<n&&forward!=null)
                {
                    forward=forward.next;
                    count++;
                }
                prev.next=forward;
                prev=forward;
                count=0;
            }
        }
        return start;
    }
    static void printList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

    public static void main(String[] args) {
        Node m = creatList();
        printList(m);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of node you wish to delete ");
        int n = s.nextInt();
        System.out.println("Enter the number of elemnts that you wish to retain:");
        int g=s.nextInt();
        Node head2=deletenafterm(m,n,g);
        printList(head2);
    }
}