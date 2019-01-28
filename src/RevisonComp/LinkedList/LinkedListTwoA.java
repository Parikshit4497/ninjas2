package RevisonComp.LinkedList;

import java.util.Scanner;

public class LinkedListTwoA {
    private class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;
    int size;
    Scanner s = new Scanner(System.in);

    public Node createList() {
        System.out.println("Enter the data to be inserted");
        int data = s.nextInt();
        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
                this.size++;
            }
            System.out.println("Enter the data that you wish to insert ");
            data = s.nextInt();
        }
        return head;
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int length(Node head) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    public Node printIthNode(Node head, int index) {

        Node temp = head;
        for (int i = 0; i < index; i++) {

            temp = temp.next;

        }
        return temp;
    }

    public Node InsertNode(Node head, int index, int data) {
        int i;
        Node temp;
        if (index > this.size) {

            return head;
        } else if (index < this.size) {
            if (index == 0) {
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            } else {
                for (i = 0, temp = head; i < index && temp != null; i++, temp = temp.next) {


                }
                Node newNode = new Node(data);
                Node nextNode = temp.next;
                temp.next = newNode;
                newNode.next = nextNode;
            }
        }
        return head;

    }

    public Node deleteNode(int index) {
        Node temp;
        if (index > this.size) {
            return head;
        } else if (index < this.size) {
            if (index == 0) {
                temp = head.next;
                this.head = temp;
                this.size--;

            } else if (index == this.size - 1) {
                temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            } else {
                int i = 0;
                for (i = 0, temp = head; i < index - 1 && temp != null; i++, temp = temp.next) {

                }
                Node idmidx = temp;
                Node inidx = temp.next;
                Node idnext = inidx.next;
                idmidx.next = idnext;
                this.size--;
            }

        }
        return head;
    }

    public int findLength(Node head) {

        if (head == null) {
            return 0;
        }
       return findLength(head.next) +1;
    }
    public Node insertNodeRec(Node head ,int data ,int pos){

        if(head==null){
            if(pos==0){
                Node newNode=new Node(data);
                return newNode;
            }else{
                return head;
            }
        }
        if(pos>this.size){
            return head;
        }else if(pos==0){

            Node newNode=new  Node(data);
            newNode.next=head;
            return newNode;
        }
        head.next=insertNodeRec(head.next, data, pos-1);
        return head;
    }
    public Node deleteNodeRec(Node head ,int pos){

        if(head==null){
            return head;
        }
        if(pos==0){
            Node temp=head.next;
            return  temp;
        }
        head.next=deleteNodeRec(head.next,pos-1);
        return head;
    }
    public Node mergeTwoSortedLinkedList(Node head1,Node head2){
        Node start;
        Node tail;
        if(head1.data<head2.data){
            start=head1;
            tail=head1;
            head1=head1.next;
        }else{
            start=head2;
            tail=head2;
            head2=head2.next;
        }
        while(head1!=null&&head2!=null){
            if(head1.data>head2.data){
                tail.next=head2;
                head2=head2.next;
            }else{
                tail.next=head1;
                head1=head1.next;
            }
            tail=tail.next;
        }
        tail.next=head1==null?head2:head1;

        return start;
    }
    public static void main(String[] args){
        LinkedListTwoA li = new LinkedListTwoA();
        Node head=li.createList();
        li.display(head);
        System.out.println();
        System.out.println("The length of the linked list is " + li.length(head));
        System.out.println("The node at the ith index is " + li.printIthNode(head,3).data);
        System.out.println("The list after the addition of node at particular index is"  );
        System.out.println(li.printIthNode(head,4).data);
        System.out.println("The length of the string is" + li.findLength(head));

        System.out.println("The list after inserting at particular node is ");
        head=li.InsertNode(head,5,9);
        li.display(head);
        System.out.println();
        System.out.println("The length of the string is " + li.findLength(head));
        System.out.println("The node after deleting is");


        li.display(li.deleteNode(4));
        System.out.println();
        System.out.println("The length of the string is" + li.findLength(head));
        Node head1=li.createList();
        Node head2=li.createList();
        Node head3=li.mergeTwoSortedLinkedList(head1,head2);
        System.out.println();
        li.display(head3);

    }
}

