package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १६-०७-२०१७.
 */
public class FindAnElem {
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
static int search(Node head,int data1)
{
    Node temp=head;
    int count=0;
    while(temp.data!=data1)
    {
        count++;
        temp=temp.next;
        if(temp==null)
        {
            return -1;
        }
        else
        {
            continue;
        }
    }
    return count;
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
        System.out.println("Enter the elemnets that you wish to research:");
        int data1 = s.nextInt();
         int index=search(m,data1);
        System.out.println("The index at which the the number is presesnt is:" + index);
    }
}