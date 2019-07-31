package RevisionCodingNinjas.LinkedList1a;

import jdk.nashorn.internal.runtime.ECMAException;

public class LinkedList1 {
    private class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    public  int size;
    public boolean isEmpty(){
        return this.size==0;
    }
    public int getSize(){
        return this.size;
    }
    public void setSize(){
        this.size+=1;
    }
    public void addAtLast(int data){
        if(this.getSize()==0){
            this.handleIfListSize0(data);
            return;
        }
        Node newNode=new Node(data);
        tail.next=newNode;
        tail=newNode;
        newNode.next=null;
        this.setSize();
    }
    public void addAtFirst(int data){
        if(this.getSize()==0){
            this.handleIfListSize0(data);
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        this.setSize();
    }
    public void addAtIndex(int index,int data) throws Exception {
        if(this.getSize()==0){
            this.handleIfListSize0(data);
        }else if( index<0||index>this.getSize()){
            throw new Exception("Index out of bound exception");
        }
         Node precNode=getNodeAtParticularIndex(index-1);
         Node node=precNode.next;
         Node newNode=new Node(data);
         precNode.next=newNode;
         newNode.next=node;
         this.setSize();

    }
    public int getFirst()throws Exception{
        if(this.getSize()==0){
            throw new Exception("List is empty");
        }
        return head.data;
    }
    public int getLast() throws Exception{
        if(this.getSize()==0){
            throw new Exception("List is empty");
        }
       return tail.data;
    }
    public int getAtparticularIndex(int index) throws Exception {
        if(this.getSize()==0){
            throw new Exception("List is empty");
        }
        else if(index<0||index>this.getSize()){
            throw new Exception("Index out of bound");
        }
        Node temp=this.head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public int removeFirst() throws Exception {
        if(this.getSize()==0){
            throw new Exception("List is empty");
        }
        int temp=head.data;
        Node secondNode=head.next;
        head=secondNode;
        this.size--;
        return temp;
    }
    public int removeLast() throws Exception{
        if(this.getSize()==0){
            throw new Exception("List is empty ");
        }
        int  temp=tail.data;
        Node secondlast=getNodeAtParticularIndex(this.getSize()-2);
        tail=secondlast;
        tail.next=null;
        this.size--;
        return temp;
    }
    public int removeAtindex(int index ,int data) throws Exception {
        Node node=null;
        if(this.size==0) {
            throw new Exception("The list is empty");
        }
        else if(index<0||index>this.getSize()){
            throw new Exception("Index out of bound Exception");
        }
        else if(index==0){
            this.removeFirst();
        }else if(index==this.getSize()-1){
            this.removeLast();
        }else {
            Node nodeminu1 = this.getNodeAtParticularIndex(index - 1);
             node = nodeminu1.next;
            Node nodeplus = node.next;
            nodeminu1.next = nodeplus;
            this.size--;
        }
            return node.data;


    }
    public Node getNodeAtParticularIndex (int index) throws Exception {
        if(this.getSize()==0){
            throw new Exception("List is empty");
        }
        else if(index<0||index>this.getSize()){
            throw new Exception("Index out of bound");
        }
        Node temp=this.head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void handleIfListSize0(int data){
        Node node=new Node(data);
        node.next=null;
        this.head=node;
        this.tail=node;
        this.setSize();
    }

}
