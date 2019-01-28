package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class PrintIthNode {;

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
  static  void printith(Node head, int pos)
    {
        int count=0;
        while(head!=null)
        {
            if(count==pos-1)

            {
                System.out.println(head.data);
            }
            head=head.next;
            count++;
        }
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
        Node m1=creatList();
        printList(m1);
        PrintIthNode m2=new PrintIthNode();
        System.out.println("Enter the position of the node that you wish to print ");
        Scanner s1=new Scanner(System.in);
        int pos=s1.nextInt();
        m2.printith(m1,pos);

    }
}
