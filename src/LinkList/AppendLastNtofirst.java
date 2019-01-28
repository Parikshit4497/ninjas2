package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १९-०७-२०१७.
 */
public class AppendLastNtofirst {
      static int count1=0;
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
                count1++;
            }
            return head;
        }
        public static Node append(Node head,int n,int count1)
        {

            Node current=head;
            Node forward=head;
            Node last=head;
            Node refer=head;
            int count=0;
            while(count<count1-1)
            {
                last=last.next;
                count++;
            }
            count=0;
            while(count<count1-n-1)
            {
                forward=forward.next;
                count++;
            }
            count=0;
            while(count<count1-n)
            {
                refer=refer.next;
                count++;
            }
            last.next=current;
            forward.next=null;
            return refer;
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
            Scanner s =new Scanner(System.in);
            System.out.println("Enter n the last n number that you wish to append with first;");
            int n =s.nextInt();
            Node m2=append(m,n,count1);
            printList(m2);

        }
    }

