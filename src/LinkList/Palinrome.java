package LinkList;

import java.util.Scanner;

/**
 * Created by hp on २०-०७-२०१७.
 */
public class Palinrome {
    static Node left;

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

        static boolean palindrome(Node head, Node tail) {
            left = tail;
            if (head == null) {
                return true;
            }
            if (head != null)
            {
                 palindrome(head.next, tail);
            }
            if (left.data==head.data) {
                left=left.next;
                return true;
            }
            else
            {
                return false;
            }
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
            Node head = m;
            Node tail = m;
            boolean result = palindrome(head, tail);
            System.out.println("The string is palindrome" + result);
        }

    }

