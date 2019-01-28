package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १९-०७-२०१७.
 */
public class DeleteEveryNnode {
    static Node  creatList() {
        Node head = null;
        Node  tail = null;
        int data;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data:");
        data = s.nextInt();
        while (data != -1) {
            Node  newNode = new Node (data);
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
    static Node deleteNnode(Node head,int n) {
        Node prev = null;
        Node current = head;
        Node forward=head.next;
        int count=0;
        while(forward!=null)
        {

            prev=current;
            current=forward;
            forward=forward.next;

            if(count==n)
            {
                prev.next=current.next;
                prev=current;
                count=0;
            }
            else {
                count++;
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
        int n;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter n which is every nth element to delete");
        n=s.nextInt();
        Node head2=deleteNnode(m,n);
        printList(head2);

    }
}
