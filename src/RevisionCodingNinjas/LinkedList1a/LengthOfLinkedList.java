package RevisionCodingNinjas.LinkedList1a;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class LengthOfLinkedList {
    static Node createList(){
        Scanner sc=new Scanner(System.in);
        Node head=null;
        Node tail=null;
        int data;
        System.out.println("Enter the data");
        data=sc.nextInt();
        while(data!=-1){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
            System.out.println("Enter the data");
            data=sc.nextInt();
        }
        return head;
    }
    public static void printList(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
    }
    public static int countLength(Node head){
        Node temp=head;
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return  count;
    }
    public static void printIthNode(int index,Node head,int count){

        if(head==null){
            System.out.println("List is empty");
        }else if(index <0||index>count){
            System.out.println("Array Index out of bound exception");
        }else if(index==0){
            System.out.println(head.data);
        }else{
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            System.out.println("The data on index " + index + " is "+temp.data);
        }

    }
    public static Node deletNode(int index,int count,Node head){
        if(index<0||index>count){
            System.out.println("Index out of bound");
        }else if(index==0){
            Node temp=head.next;
            head=temp;
        }else {
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node nm1=temp;
            Node nm=temp.next;
            Node nmnext=nm.next;
            nm1.next=nmnext;
        }

         return head;
     }
    public static Node insertNode(int data,int index,int count,Node head){
          if(index<0||index>count){
              System.out.println("Index out of bound exception ");
          }else if(index==0){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            return  head;
           }else {
              Node temp=head;
              Node newNode=new Node(data);
              for(int i=0;i<index-1;i++){
                  temp=temp.next;
                  if(temp.next==null){
                      temp.next=newNode;
                      newNode.next=null;
                  }
              }
              Node nm1=temp;
              Node node1=temp.next;
              nm1.next=newNode;
              newNode.next=node1;

          }
          return head;
    }
    public static int lengthRecursively(Node head){
        if(head==null){
            return 0;
        }
        return lengthRecursively(head.next)+1;
    }
    public static Node insertNodeRecursively(Node head,int data,int index){
            if(head==null){
                if(index==0){
                    Node newNode=new Node(data);
                    return newNode;
                }else{
                    return head;
                }
            }
            if(index==0){
                Node newNode=new Node(data);
                newNode.next=head;
                return newNode;
            }
            head.next=insertNodeRecursively(head.next,data,index-1);
            return head;
    }
    public static Node deleteNoderec(Node head,int index){
        if(head==null){
            return head;
        }
        if(index==0){
            return head.next;
        }
        head.next=deleteNoderec(head.next,index-1);
        return head;
    }
    public static void main(String[] args) {
        Node m=createList();
        int count=countLength(m);
        System.out.println("The number of nodes in the list is " + count);
        printList(m);
        System.out.println();
        printIthNode(2,m,count);
        Node m1=insertNode(5,4,count,m);
        printList(m1);
        count=countLength(m1);
        System.out.println();
        System.out.println("list after deletion");
        printList(deletNode(6,count,m1));
        System.out.println();
        System.out.println(lengthRecursively(m1));
        System.out.println();
        printList(insertNodeRecursively(m1,8,7));
        System.out.println();
        printList(deleteNoderec(m1,6));

    }
}
