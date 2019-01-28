package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १५-०७-२०१७.
 */
public class ReverseRecursively {
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

    static Node reverse(Node head,Node prev) {
        Node forward;
        Node current=head;

        if(current==null)
        {
            return prev;
        }
        else
        {
            forward=current.next;
            current.next=prev;
            return reverse(forward,current);
        }


    }

    static void printList(Node head) {
        if (head == null) {
            return;
        }
        if (head != null) {
            System.out.println(head.data);
            printList(head.next);
        }

    }

    public static void main(String[] args) {
        Node m = creatList();
        printList(m);

        Node m1 = reverse(m,null);
        System.out.println("The list after reversing is");
        printList(m1);
    }
}
