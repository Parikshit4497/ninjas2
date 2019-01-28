package RevisionDataStructure;

import java.util.Scanner;

/**
 * Created by hp on १३-०७-२०१७.
 */
public class LinkListRecursion {
   static  Node CreateList()
   {
       int data ;
       Node head=null;
       Node tail=null;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the data ");
       data=s.nextInt();
       while(data!=-1)
       {
           Node newNode=new Node(data);
           if(head==null)
           {
               head=newNode;
               tail=newNode;
           }
           else
           {
               tail.next=newNode;
               tail=newNode;
           }
           System.out.println("Enter the data:");
           data=s.nextInt();
       }
       return head ;
   }
   static void printlist(Node head)
   {
       if(head==null)
       {
           return ;
       }
       else
       {
           System.out.println(head.data);
           printlist(head.next);
       }
   }

    public static void main(String[] args) {
        Node m1=CreateList();
        printlist(m1);
    }
}
