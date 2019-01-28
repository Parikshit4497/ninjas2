package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class InsertaNodeRecusively {
    static int count1=0;
    static Node  creatList() {
        Node  head = null;
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
            count1++;
        }
        return head;
    }

    static Node position(Node  head,Node start, int i, int data1,int count,int count1) {


        Node  newNode1 = new Node (data1);
        if(i>count1)
        {
            return head;
        }
        else if(i<=count1) {
            if (i == 0) {
                newNode1.next = head;
                return newNode1;
            }
            if (count != i - 1) {

                count++;
                return position(head.next, start, i, data1, count, count1);

            }
            Node temp = head;
            newNode1.next = temp.next;
            head.next = newNode1;
        }

        return start;

    }

    static void printList(Node  head) {
        if (head == null) {
            return;
        }
        if (head != null) {
            System.out.println(head.data);
            printList(head.next);
        }

    }

    public static void main(String[] args) {
        Node  m = creatList();
        printList(m);
        Scanner s = new Scanner(System.in);
        System.out.println("enter the data you wish to insert ");
        int data1 = s.nextInt();
        System.out.println("Enter the position you wish to insert the number");
        int i = s.nextInt();
        Node start=m;
        Node  m1 = position(m,start, i, data1,0,count1);
        printList(m1);
    }
}
