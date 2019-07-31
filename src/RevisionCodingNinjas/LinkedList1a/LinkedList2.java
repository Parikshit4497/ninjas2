package RevisionCodingNinjas.LinkedList1a;

import java.util.Scanner;

public class LinkedList2 {
    static  Node createList(){
        Node head=null;
        Node tail=null;
        int data ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data ");
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
        return  head;
    }


    public static void printList(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node m=createList();
        printList(m);
    }

}
