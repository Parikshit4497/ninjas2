package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १६-०७-२०१७.
 */
public class TofindTheMidPointOftheLinkedList {
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

    static int midpoint(Node head) {
      Node slow=head;
      Node fast=head;
      while(fast!=null)
      {
          slow=slow.next;
          fast=fast.next.next;
      }
      int  ans=slow.data;
      return ans;
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
        int n = midpoint(m);
        System.out.println("The midpint of the linked is " + n);
    }
}
