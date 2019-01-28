package LinkList;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by hp on २३-०७-२०१७.
 */
public class ReverseKElements {
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
    public static Node ReverseKelem(Node head,int k)
    {   Node temp=head;
        Node prev=null;
        Node  forward=null;
        Node  current=head;
         int n=0;
        while(current!=null&&n<k)
            {

                forward = current.next;
                current.next = prev;
                prev = current;
                current = forward;
                n++;
            }
            if(forward!=null)
            {
                 head.next=ReverseKelem(forward,k);
        }
        return prev;


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
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k=s.nextInt();
        Node prev=null;
        System.out.println("The list after reversing is");
        Node temp=m;
        Node m2=ReverseKelem(m,k);
        printList(m2);
    }

}