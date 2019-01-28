package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class DeleteAnode {
    static Node createList()
    {
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
        }
        return head;
    }
  static Node  deletenode(Node  head, int pos) {
        Node  prev=null;
        Node  current=head;
        Node  forward=head.next;
        int count=0;
        if(pos==0) {
            head=head.next;
            return head;
        }
        while(count!=pos-1)
      {
          count++;
          prev=current;
          current=forward;
          forward=forward.next;
      }
        prev.next=current.next;
      current=prev;
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
        Node  m1=createList();
        printList(m1);
        int pos;
        Scanner s1 =new Scanner(System.in);
        System.out.println("Enter the position of the node taht you wish to delete ");
        pos=s1.nextInt();
        Node  m2=deletenode(m1,pos);
        System.out.println("The list after deleting the node is:");
        printList(m2);
    }
}
