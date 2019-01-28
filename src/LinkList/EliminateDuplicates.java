package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १६-०७-२०१७.
 */
public class EliminateDuplicates {
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

    static Node duplicates(Node head) {

        Node current=head;
        Node prev=head;
        while(current!=null||prev!=null)
        {
            if(prev.next==null||current.next ==null)
        {
            current.next=null;
            return head;
        }

            else if (current.data!=current.next.data) {
                current = current.next;
                 prev=current;

            }

            else  if(prev.data==prev.next.data)
            {
                prev=prev.next;
            }
            else
            {
                current.next=prev.next;
            }
        }
        return head;
    }

    static void printList(Node  head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }

    }
    public static void main(String[] args) {
        Node  m = creatList();
        printList(m);
        Node m2=duplicates(m);
        System.out.println("The list after eliminating duplicates is:");

        printList(m2);
    }
}
