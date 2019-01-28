package RevisonComp.LinkedList;
class LinkedList1{
    private class Node{
        Node next ;
        int data ;
        public Node(int data) {
            this.data = data;
        }
    }
    Node head=null;
    Node tail=null;
    int size ;
    public int  getSize(){
        return this.size;
    }
    public void setSize(){
        this.size+=1;
    }
    public boolean isEmpty(){
        return  this.size==0;
    }
    public void display(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
    public void addFirstNode(int data ){
        if(this.getSize()==0){
            this.handleIfListEmpty(data);
            return ;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        this.head=newNode;
        this.setSize();
    }
    public int  getFirstNodedata()  throws Exception{
        if(this.getSize()==0){
            throw new Exception("The list is empty");
        }
        Node temp=head;
        return temp.data;
    }
    public int getLastNodedata() throws Exception {
        if(this.getSize()==0){
            throw new Exception("The list is empty ");
        }
        Node temp=tail;
        return  temp.data;
    }
    public int getAtpartIndex(int index) throws Exception{
        if(index==0){
            return this.getFirstNodedata();
        }
        if(index==this.getSize()-1){
            return  this.getLastNodedata();
        }
        if(index<0||index>=this.getSize()){
            throw new Exception("Index out of bound excepion ");
        }else{
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public Node getNodeAtpartIndex (int index) throws Exception
    {

        if (index == 0) {
            return head;
        }
        if (index == this.getSize() - 1) {
            return tail;
        }
        if (index < 0 || index >= this.getSize()) {
            throw new Exception("Index out of bound excepion ");
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

    }
    public int  removeFromFirst() throws Exception{
        if(this.getSize()==0){
            throw new Exception("The list is empty ");
        }
        if (this.getSize()==1){
           return this.handleIfListSize1();
        }
        Node temp=head;
        this.head=head.next;
        this.size--;
        return  temp.data;
    }
    public int removeLast() throws Exception {
        if(this.getSize()==0){
            throw new Exception("The list is empty ");
        }
        if(this.getSize()==1){
            return this.handleIfListSize1();
        }
        Node thismidx=this.getNodeAtpartIndex(this.getSize()-2);
        Node thisidx=thismidx.next;
        int temp=thisidx.data;
        thismidx.next=null;
        tail=thismidx;
        this.size--;
        return temp;

    }
    public int removeAtParticularIndex(int index) throws Exception{
        if(this.size==0){
            throw new Exception("List is empty ");
        }
       else if(index==0){
            return this.removeFromFirst();
        }
        else if(index==this.getSize()-1){
           return this.removeLast();
        }
       else  if(index<0||index>=this.size){
            throw  new Exception("Index out of bound exception ");
        }else {
            Node indmidx = this.getNodeAtpartIndex(index - 1);
            Node indidx = indmidx.next;
            Node indnxtidx = indidx.next;
            indmidx.next = indnxtidx;
            this.size--;
            return  indidx.data;
        }

    }
    public int   handleIfListSize1() {
        Node tem=head;
        head=null;
        tail=null;
        return  tem.data;
    }
    public void addAtpartIndex(int index,int data ) throws Exception{
       if(this.getSize()==0){
           throw new Exception("the list is empty ");
       }
        if(index<0||index>=this.getSize()){
            throw  new Exception("Index out of bound exception ");
        }else{
            Node newNode =new Node(data);
            Node thismidx=this.getNodeAtpartIndex(index-1);
            Node thisisdx=thismidx.next;
            thismidx.next=newNode;
            newNode.next=thisisdx;
            this.setSize();
        }
    }
    public  void addLastNode(int data ){
        if(this.getSize()==0){
         this.handleIfListEmpty(data);
            return;
        }
        Node newNode=new Node(data);
        tail.next=newNode;
        tail=newNode;
        newNode.next=null;
        this.setSize();
    }
    public int handleIfListEmpty(int data ){
        Node newNode=new Node(data);
        newNode.next=null;
        this.tail=newNode;
        this.head=newNode;
        this.setSize();
        return head.data;
    }

}
public class Client1  {
    public static void main(String[] args) throws Exception{
       LinkedList1 li=new LinkedList1();
       li.addLastNode(1);
       li.addLastNode(5);
       li.addAtpartIndex(1,2);
       li.display();
        System.out.println();
        System.out.println("first node " +li.getFirstNodedata());
        System.out.println("last node " +li.getLastNodedata());
        System.out.println("get at particular index " + li.getAtpartIndex(1));
        li.addAtpartIndex(2,3);
        li.addAtpartIndex(3,4);

        li.addLastNode(6);
        li.addLastNode(7);
        li.addLastNode(8);
        System.out.println();
        li.display();
        li.removeFromFirst();
        li.removeLast();
        System.out.println();
      li.removeAtParticularIndex(3);
        li.display();
    }
}
