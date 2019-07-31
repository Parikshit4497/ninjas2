package RevisionCodingNinjas.LinkedList1a;


public class LinkedList {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head ;
    private Node tail;
    private  int size;
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public void setSize(){
        this.size+=1;
    }
    public void addDataLast(int data){
        if(this.isEmpty()){
            this.handleAddWhenSize0(data);
            return;
        }
        Node newNode=new Node(data);
        tail.next=newNode;
        tail=newNode;
        newNode.next=null;
        this.setSize();
    }
    public void addAt(int data ,int index) throws  Exception{
          if(index<0||index>this.getSize()){
              throw  new Exception("Index out of bound");
          }else if(index==0){
             this.addFirst(data);
           }else if(index==this.getSize()-1){
              this.addDataLast(data);
          }else{
            Node idxm1Node=this.getNodeAtIndex(index-1);
            Node idxNode=idxm1Node.next;
            Node newNode=new Node(data);
            newNode.next=idxNode;
            idxm1Node.next=newNode;
            this.setSize();
          }
    }
    public void addFirst(int data){
        if(this.isEmpty()){
            this.handleAddWhenSize0(data);
            return;
        }
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
        this.setSize();
    }
    public void handleAddWhenSize0(int data){

        Node newNode=new Node(data);
        newNode.next=null;
        this.tail=newNode;
        this.head=newNode;
        this.setSize();

    }
    public int getFirst() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Size is empty");
        }
        return head.data;
    }
    public int getLast() throws  Exception{
        if(this.isEmpty()){
            throw new Exception("The list is empty");
        }
        return  tail.data;
    }
    public int getAtIndex(int index) throws Exception{
        if(this.isEmpty()){
            throw new Exception("List is empty");
        }else if(index<0||index>this.getSize()){
            throw  new Exception("Index out of bound exception");
        }else{
            int i=0;
            Node temp=this.head;
            while(i<index){
                temp=temp.next;
                i++;
            }
            return temp.data;
        }

    }
    public Node getNodeAtIndex(int index) throws Exception{
        if(this.isEmpty()){
            throw new Exception("List is empty");
        }else if(index<0||index>this.getSize()){
            throw  new Exception("Index out of bound exception");
        }else{
            int i=0;
            Node temp=this.head;
            while(i<index){
                temp=temp.next;
                i++;
            }
            return temp;
        }

    }
    public int removeFirst() throws Exception{
        int temp = 0;
        if(this.isEmpty()){
            throw new Exception("List is empty");
        }
        else if(this.getSize()==1){
         return this.removeIfListSizeisOne();
        }else {
            temp= head.data;
            Node secondnode = head.next;
            head = secondnode;
            this.size--;
        }
        return temp;
    }
    public int removeLast() throws Exception{
        int temp = 0;
        if(this.isEmpty()){
            throw new Exception("List is empty");
        }
        else if(this.getSize()==1){
            return this.removeIfListSizeisOne();
        }else {
             temp= tail.data;
             Node secondLastnode = this.getNodeAtIndex(this.getSize()-2);
             tail=secondLastnode;
             tail.next=null;
             this.size--;
        }
        return temp;
    }
    public int removeIfListSizeisOne(){
        int temp=head.data;
        head=tail=null;
        this.size--;
        return temp;
    }
    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
    public int removeAt( int index) throws  Exception {
        Node nmnext1;
        Node nmnext = null;
        if (index < 0 || index > this.getSize()) {
            throw new Exception("Index out of bound");
        } else if (index == 0) {
            this.removeFirst();
        } else if (index == this.getSize() - 1) {
            this.removeLast();
        } else {
            Node nm1 = this.getNodeAtIndex(index - 1);
            nmnext = nm1.next;
            nmnext1 = nmnext.next;
            nm1.next = nmnext1;
            this.size--;


        } return nmnext.data;
    }
}
