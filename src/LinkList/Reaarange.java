package LinkList;

import java.util.Scanner;

/**
 * Created by hp on २१-०७-२०१७.
 */
public class Reaarange {
    static int count=0;
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
            count++;
        }
        return head;
    }
    static Node rearrange(Node head,int n )
    {
        Node current=head;
        Node forward=head.next;
        int count1=0;


        while(count1<n-1)
        {

            current=forward;
            forward=forward.next;
            count1++;
        }
        current.next=null;
        current=head;
        Node start=null;
        Node ahead=forward;
        Node ahead1;

        while(ahead!=null)
        {   ahead1=ahead.next;
            ahead.next=start;
            start=ahead;
            ahead=ahead1;
        }
        Node prev1=current;
        Node current1=current.next;
        Node prev2=start;
        Node current2=start.next;
       while(current1!=null)
       {
           prev1.next=prev2;
           prev2.next=current1;
           prev1=prev2;
           prev1=current1;
           current1=current1.next;
           prev2=current2;
           current2=current2.next;
       }
       prev1.next=prev2;

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
        Node head=m;
        int n;
        if(count%2==1)
        {
            n=count/2+1;
        }
        else
        {
            n=count/2;
        }
        Node m3=rearrange(head,n);
        System.out.println("The list after rearranging is :");
        printList(m3);

    }
}
