package LinkList;

import java.util.Scanner;

/**
 * Created by hp on २१-०७-२०१७.
 */
public class EvenAfterOdd{
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
    public static Node eventhenodd(Node head)
    {   Node temp=head;
        Node head2=null;
        Node tail2=null;
        Node head1=null;
        Node tail1=null;
        int data =0,data1=0;
        while(temp!=null)
        {

            if(temp.data%2==1)
            {

                data=temp.data;
                Node newNode = new Node(data);
                if(head1==null)
                {
                    head1=newNode;
                    tail1=newNode;
                }
                else
                {
                    tail1.next=newNode;
                    tail1=newNode;
                }
            }
            else
            {
                data1=temp.data;
                Node newNode1 = new Node(data1);
                if(head2==null)
                {
                    head2=newNode1;
                    tail2=newNode1;
                }
                else
                {
                    tail2.next=newNode1;
                    tail2=newNode1;
                }
            }


            temp=temp.next;
        }
        tail1.next=head2;
        return head1;
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
        Node m2 =eventhenodd(m);
        System.out.println("after changes");
        printList(m2);
    }
}
