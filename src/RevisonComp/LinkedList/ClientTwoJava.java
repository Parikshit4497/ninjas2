package RevisonComp.LinkedList;

public class ClientTwoJava {

    private class Node{
        Node next;
        int data ;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head=null;
    Node tail=null;
    int size=0;
    public int getSize(){
        return this.size;
    }
    public  boolean isEmpty(){
        return this.size==0;
    }
    public void addFirst(int data){
        if(this.isEmpty()){
            this.listIsEmpty(data);
        }else {
            Node newNode = new Node(data);
            newNode.next = head;
            this.head = newNode;
        }
        this.size++;
    }
    public  void  addLast(int data) {
        if (this.isEmpty()) {
            this.listIsEmpty(data);
        }else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
            newNode.next = null;
        }
        this.size++;
    }
    public Node removeFirst() throws Exception {
        if(this.isEmpty()){
            throw new Exception("The list is empty ");
        }
                if(this.size==1){
           return this.ifListSizeIs1();
        }
                    Node temp = head;
                    this.head = head.next;
                    this.size--;
                    return temp;


    }
    public Node ifListSizeIs1(){
        Node temp=head;
        head=null;
        tail=null;
        this.size--;
        return temp;
    }
    public Node removeLast() throws Exception {
        if(this.isEmpty()){
            throw new Exception("List is empty ");
        }
        if(this.size==1){
            return  this.ifListSizeIs1();
        }else {
            Node thisimdx = this.getNodeatParticularIndex(this.size - 2);
            Node thismdx = thisimdx.next;
            Node temp = thismdx.next;
            thismdx.next = null;
            tail = thisimdx;
            this.size--;
            return temp;
        }
    }
    public Node addNodeAtPartiularIndex(int index,int data) throws Exception{

        if(this.isEmpty()){
            throw new Exception("The list is empty ");
        }else if(index<0&&index>=0){
            throw  new Exception ("The index is out of bound ");
        }
        else if(index==this.size-1){
            this.addLast(data);
        }
        else if(index==0){
            this.addFirst(data);

        }else {
            Node newNode = new Node(data);
            Node thismidx = this.getNodeatParticularIndex(index - 1);
            Node thisidx = thismidx.next;
            thismidx.next = newNode;
            newNode.next = thisidx;
            this.size++;
        }
            return head;

    }
    public Node removeAtparticularIndex(int index ) throws Exception{

        if(this.isEmpty()){
            throw new Exception("The list is empty ");
        }
        else if(index==0){
              this.removeFirst();
        }else if(index==this.size-1){
            return  this.removeLast();
        }
        else if(index<0&&index>=this.size){
            throw new Exception("The index is out of bound ");
        }
        else {
            Node thismidx = this.getNodeatParticularIndex(index - 1);
            Node thisidx = thismidx.next;
            Node thisidnxt = thisidx.next;

            thismidx.next = thisidnxt;
            this.size--;
        }
        return this.head;
    }
    public Node getNodeatParticularIndex(int index) throws Exception {
        if(this.isEmpty()){
            throw new Exception("The list is empty ");
        }
        else if(index<0&&index>=this.size){
         throw new Exception("The index is out of bound ");
        }
      else   if(index==0){
            return head ;
        }
        if(index==this.size-1){
            return  tail;
        }
      else{
            Node temp=head;
            for( int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp ;
        }
    }
    public Node getFirstNode() throws Exception {
        if(this.isEmpty()){
            throw new Exception("The list is empty ");
        }
        return  head;
    }
    public Node getLastNode() throws Exception {
        if(this.isEmpty()){
            throw  new Exception("The list is empty" );
        }
        return  tail;
    }
    public Node listIsEmpty(int data){

        Node newNode=new Node(data);
        newNode.next=null;
        this.head=newNode;
        this.tail=newNode;

        this.size++;
        return  head;
    }
    public void display(){
        Node temp=head ;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) throws  Exception{
        ClientTwoJava li=new ClientTwoJava();
        li.addFirst(1);
       li.addLast(5);
       li.addLast(6);
       li.addNodeAtPartiularIndex(1,2);
        li.display();
        System.out.println();
        System.out.println(" get Last " + li.getLastNode().data);
        System.out.println("get first" +li.getFirstNode().data);
        System.out.println("get node at particular " +li.getNodeatParticularIndex(0).data);


    }

}
