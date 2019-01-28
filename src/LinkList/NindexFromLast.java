package LinkList;

import java.util.Scanner;

public class NindexFromLast {
    static int count1=0;
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
            count1++;
        }
        return head;
    }
    static Node nthnodefromlast(int n,Node head,int count1,int count)
    {
        Node temp=head;
        Node prev=null;
        if(n>count1)
        {
            return null;
        }
        else if(n<count1)
        {
            while(count!=count1-n)
            {
                prev=temp;
                temp=temp.next;
                count++;
            }
        }
        return prev;
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
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the position of the node that you wish to print from the end ");
        int n=s1.nextInt();
      Node head1 = nthnodefromlast(n,m,count1,0);
        System.out.println("The n th node from last is :" + head1.data);
    }
}
