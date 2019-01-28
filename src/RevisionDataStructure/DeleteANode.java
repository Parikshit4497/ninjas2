package RevisionDataStructure;

import java.util.Scanner;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class DeleteANode {

    static Node creatList() {
        int data;
        Node head = null;
        Node tail = null;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the data ");
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
            System.out.println("Enter the data you wish to add:");
            data = s.nextInt();
        }
        return head;
    }

    static Node deletenode(int pos, Node head) {
        int count = 0;
        Node prev = null;
        Node current = head;
        Node forward = head.next;
        while (count != pos - 1) {
            prev = current;
            current = forward;
            forward = forward.next;
            count++;
        }
        prev.next = current.next;
        prev = current;
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node m1 = creatList();
        printList(m1);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the position of the node which you wish to change :");
        int pos = s.nextInt();
        deletenode(pos, m1);
        printList(m1);
    }
}
