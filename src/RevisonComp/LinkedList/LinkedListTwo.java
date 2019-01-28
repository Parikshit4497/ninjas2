package RevisonComp.LinkedList;

import java.util.Scanner;

public class LinkedListTwo {
    static Scanner s=new Scanner(System.in);

    private static class Node{
        Node next ;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
    private  Node head=null;
    private  Node tail=null;
    static private  int size=0;
    public  Node createList(){

        System.out.println("Enter the data that you wish to insert in the list ");
        int data=s.nextInt();
        while(data!=-1){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
                this.size++;
            }else{
                tail.next=newNode;
                tail=newNode;
                this.size++;
            }
            System.out.println("Enter the data that you wish to enter in the list ");
             data =s.nextInt();
        }
        return  head;
    }
    public void display(Node head){
        Node temp=head ;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
    public void printIthElement(Node head,int index){
        if(this.size==0){
            System.out.println("The list is empty ");
        }
        int i=0;
        Node temp=head;
        while(temp!=null){

            if(i==index){
                System.out.println("the ith element is " + temp.data);
            }
            i++;
            temp=temp.next;

        }

    }

    public Node enterIthElement (Node head, int index,int data ){

        Node newNode=new Node(data);
        Node temp;
        int i;
       if(index>this.size){
            return head ;
        }else if(index<this.size) {
           if (index == 0) {
               newNode.next = head;
               head = newNode;
               return head;
           } else {
               for (i = 0, temp = head; i < index - 1 && temp != null; i++, temp = temp.next) {

               }
               Node tempNext = temp.next;
               temp.next = newNode;
               newNode.next = tempNext;
           }
       }
           return head;


    }
    public Node deleteIthNode(Node head ,int index){
        Node temp=head;
        int i;
      if(index>this.size){
          return head;
      }else if(index==this.size-1){
          while(temp.next.next!=null){
              temp=temp.next;
          }
        temp.next=null;
      } else if(index<this.size) {
          if (index == 0) {
              Node firstTem = temp.next;
              this.head = firstTem;
              this.size--;
              return firstTem;
          }else{
              for (i = 0, temp = head; i < index - 1 && temp != null; i++, temp = temp.next) {

              }

                  Node nodeidxm = temp;
                  Node nodeidx = temp.next;
                  Node nodidxnxt = nodeidx.next;
                  nodeidxm.next = nodidxnxt;
                  this.size--;


          }

      }
      return head;
    }
    public static int listLengthRecursive(Node head,int count){


        if(head==null){
            return count;
        }
        if(head!=null){
            return listLengthRecursive(head.next,count+1);
        }
      return count;
    }
    public static Node insertRecursive(Node head ,int data ,int pos){
         if(head==null){
             if(pos==0) {
                 Node newNode = new Node(data);
                 return newNode;
             }else{
                 return  head ;
             }
         }
        if(pos==0){
             Node newNode=new Node(data);
             newNode.next=head;
             return newNode;
        }
      head.next=insertRecursive(head.next,data,pos-1);


        return  head;

    }
    public static Node  deleteRecurive(Node head,int pos){
      if(head==null){
          return  head;
      }
      if(pos==0){

          return  head.next;
      }
      head.next=deleteRecurive(head.next,pos-1);
      return head;
    }
    public static void main(String[] args) {
        LinkedListTwo li=new LinkedListTwo();
        Node start =li.createList();
        li.display(start);
//        System.out.println();
//        li.printIthElement(start,3);
//        System.out.println();
//       Node headNew= li.enterIthElement(start,3,11);
//        System.out.println();
//       li.display(headNew);
//       headNew=li.enterIthElement(headNew,0,9);
//        System.out.println();
//        li.display(headNew);
//        headNew=li.enterIthElement(headNew,9,10);
//        System.out.println();
//        li.display(headNew);
//        headNew=li.deleteIthNode(headNew,0);
//        System.out.println();
//        li.display(headNew);
//        headNew=li.deleteIthNode(headNew,li.size-1);
//        System.out.println();
//        li.display(headNew);
//        li.deleteIthNode(headNew,4);
//        System.out.println();
//        li.display(headNew);

        System.out.println();
        System.out.println("Length of the string recursively is " + li.listLengthRecursive(start,0) );
        Node headNew=insertRecursive(start,20,4);
        System.out.println();
        li.display(headNew);
        headNew=deleteRecurive(headNew,4);
        System.out.println();
        li.display(headNew);
        s.close();

    }
}
