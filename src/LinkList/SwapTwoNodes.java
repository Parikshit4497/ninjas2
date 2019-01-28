package LinkList;

import java.util.Scanner;

/**
 * Created by hp on २३-०७-२०१७.
 */
public class SwapTwoNodes {
    static int count=0;
    static Node creatList(){
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
static Node swap(Node head,int i,int j,int count)
{
   Node  prev1=null;
   Node prev2=null;
   Node current1=head;
   Node current2=head;
   int counti=0;
   int countj=0;
   Node start=head;
   while(counti<i)

   {
       prev1=current1;
       current1=current1.next;
       counti++;
   }
   while(countj<j)
   {
       prev2=current2;
       current2=current2.next;
       countj++;
   }
   /*   if(i==0&&j==1)
       {
           prev2=null;
           current2=current1.next;
           current1.next=current2.next;
           current2.next=current1;
           head=current2;
           return head;
       }
       else if(j==0&&i==1)
       {   prev1=null;
           current1=current2.next;
           current2.next=current1.next;
           current1.next=current2;

           head=current1;
           return head;
       }
       else if(i==0&&(j>1&&j<3))
       {
           current1.next=current2.next;

            current2.next=prev2;
           prev2.next=current1;

           head=current2;

       }
       else if(j==0&&(i>1&&i<3))
       {
           current2.next=current1.next;
           current1.next=current2.next;
           prev1.next=current2;
           head=current1;
       }
       else if(i>=3||j>=3)
      {
          Node temp=current1.next;
          current1.next=current2.next;
          current2.next=temp;
      }
       else if(i==count-1||j==count-1)
       {
           if(i<j)
           {
               current2.next=current1;
               prev1.next=current2;
               current1.next=null;
           }
           else
           {
               current1.next=current2;
               prev2.next=current1;
                current2.next=null;

           }

       }*/
    if (current1 == null || current2== null)
        return head;


    if (prev1 != null)
        prev1.next = current2;
    else
        head = current2;

    if (prev2 != null)
        prev2.next = current1;
    else
        head = current1;

    Node temp = current1.next;
    current1.next = current2.next;
    current2.next = temp;

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
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the index of the first node (i)that you wish to swap :");
        int i=s.nextInt();
        System.out.println("Enter the index of the second node(j) that you wish to swap :");
         int j=s.nextInt();
        Node head3= swap(m,i,j,count);
         printList(head3);
    }
}
