package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १३-०७-२०१७.
 */
public class LinkListRecursion {
    static Node creatList() {
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


    static void printList(Node  head)
    {
        if(head==null)
        {
            return ;
        }
        if(head!=null)
        {
            System.out.println(head.data);
            printList(head.next);
        }

    }
    public static void main(String[] args) {
        Node  m = creatList();
        printList(m);

    }

}
