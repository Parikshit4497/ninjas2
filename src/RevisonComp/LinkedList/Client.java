package RevisonComp.LinkedList;

 class LinkedList{
    private class Node{
        Node next ;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public Node(Node next) {
            this.next = next;
        }
    }
    private Node head=null;
    private Node tail=null;
    private  int size;
    public int size(){
       return this.size;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public void addLast(int data ){
        if(this.isEmpty()){
            this.whenIsSizeHandle(data);
                    return;
        }
        Node node=new Node(data);
        node.next=null;
        tail.next=node;
        tail=node;
        this.size++;
    }
    public void addAtintIndex (int index,int data) throws Exception{
        if(index==0){
            this.addFirst(data);
        }
        if(index==this.size()-1){
            this.addLast(data);
        }
        if(index<0||index>=this.size()){
            throw  new Exception("Index out of bound exception ");
        }else{
            Node newNode =new Node(data);
            Node thismidx=this.getNodeAtIndex(index-1);
            Node thisidx=thismidx.next;
         thismidx.next=newNode;
         newNode.next=thisidx;


        }
    }

    public void whenIsSizeHandle(int data ){
        Node newNode=new Node(data);
        newNode.next=null;
        this.tail=this.head=newNode;
        this.size++;
    }
    public void  addFirst (int data ) {
        Node newNode= new Node(data);

        newNode.next=head;
        this.head=newNode;
        this.size();
    }

    public int getFirst(int data ) throws Exception {
        if(this.size==0){
            throw new Exception("The list is empty");
        }
        return this.head.data;
    }
    public int getLast(int data) throws Exception {
        if(this.size==0){
            throw  new Exception("The list is empty");
        }
        return this.tail.data;
    }
    public int getAtIndex(int idx)throws Exception{
     if(this.size==0){
         throw new Exception("The linked list is empty");
     }else if(idx<0||idx>=this.size){
         throw new Exception("Index out of bound exception ");
     }
     Node temp=head;
     for(int i=0;i<idx;i++){
         temp=temp.next;
     }
     return  temp.data;
    }
    public int removeFirst() throws Exception{
        if(this.size==0){
            throw  new Exception("This list is empty ");
        }
        if(this.size==1){
            return  this.handlesIfListSizaIs1();
        }
        int temp=head.data;
        head=head.next;
        this.size--;
        return temp;
    }
    public int handlesIfListSizaIs1() {
        int temp=head.data;
        head=tail=null;
        this.size--;
        return  temp;
    }
     public Node getNodeAtIndex(int idx)throws Exception{
         if(this.size==0){
             throw new Exception("The linked list is empty");
         }else if(idx<0||idx>=this.size){
             throw new Exception("Index out of bound exception ");
         }
         Node temp=head;
         for(int i=0;i<idx;i++){
             temp=temp.next;
         }
         return  temp;
     }
    public int removeLast()throws Exception {
        if(this.size==0){
            throw new Exception("This list is empty ");
        }
        if(this.size==1){
            return this.handlesIfListSizaIs1();
        }
        Node thismidxnd=this.getNodeAtIndex(this.size()-2);
        Node thisidx=thismidxnd.next;
        tail=thismidxnd;
        int temp=thisidx.data;
        tail.next=null;
        this.size--;
        return  temp;

    }
    public int removeAtaParticularIndex(int idx) throws Exception{
        if(this.size==0){
            throw new Exception("The list is empty ");
        }
        if(idx<0||idx>=this.size){
            throw  new Exception("out of bound exception ");
        }else if(idx==0){
            return this.removeFirst();

        }else if(idx==this.size-1) {
            return this.removeLast();
        }else {
            Node thismidx = this.getNodeAtIndex(idx - 1);
           Node thisidx=thismidx.next;
           Node thisplusid=thisidx.next;
           thismidx.next=thisplusid;
            return thismidx.data;
        }

    }
    public void display(){

        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Client {
    public static void main(String[] args) throws  Exception{
        LinkedList li = new LinkedList();
        li.addLast(4);
        li.addLast(5);

        li.addLast(6);
        li.addLast(7);
        li.addLast(8);

        li.display();
        li.removeAtaParticularIndex(2);
        System.out.println();
        li.display();
        li.addAtintIndex(2,6);
        System.out.println();
        li.display();
        System.out.println();
        System.out.println("The node at the give index is  " + li.getAtIndex(2));
        li.removeFirst();
        System.out.println();
        li.display();
        li.removeLast();
        System.out.println();
        li.display();
        li.removeAtaParticularIndex(1);
        System.out.println();
        li.display();
    }
}