package LinkList;

import java.util.Scanner;
/**
 * Created by hp on १५-०७-२०१७.
 */
public class DeleteAnodeRecusrively {
    static int count1=0;
    static Node createList() {
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
            count1++;
        }
        return head;
    }

 /**   static Node deletenode(Node head, int pos,int count,Node prev,Node head2) {
         Node current=head;
         Node forward=head.next;
         Node temp=head;
         int count1=0;
        while(temp!=null)
        {
            count1++;
            temp=temp.next;

        }
        if(pos>count1)
        {
            return head2;
        }
        if(pos<count1) {
            if (pos == 1) {
                head = head.next;
                return head;
            }
            if (count != pos - 1) {
                count++;
                prev = current;
                current = forward;
                return deletenode(forward, pos, count, prev, head2);
            }
            prev.next = current.next;
            current = prev;
        }
            return head2;

    }*/
     static Node deletenode(Node head,int pos,int count, Node head2,int count1)
     {
         Node current=head;
         if(pos>count1)
         {
             return head2;
         }
         if(pos<count1)
         {
             if(pos==1)
             {
               head=head.next;
               return head;
             }
              else if(count!=pos-1)
             {
                 count++;
                 return deletenode(current.next,pos,count,head2,count1);
             }
             current.next=current.next.next;
         }
         return head2;
     }
    static void printList(Node head) {
        if (head == null) {
            return;
        }
        if (head != null) {
            System.out.println(head.data);
            printList(head.next);
        }

    }


    public static void main(String[] args) {
        Node m1 = createList();
        printList(m1);
        int pos;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the position of the node that you wish to delete ");
        pos = s1.nextInt();
        Node m2 = deletenode(m1,pos,0,m1,count1);
        System.out.println("The list after deleting the node is:");
        printList(m2);
    }
}