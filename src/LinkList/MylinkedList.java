package LinkList;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class MylinkedList {
     private Node2 head;
     MylinkedList(int  data)
    {
       head=new Node2(data);
    }
    public void add(int data)
    {
        Node2 newNode=new Node2(data);
        Node2 current=head;
        while(current.getNext()!=null)
        {
             current=current.getNext();

        }
        current.setNext(newNode);
    }
    public void printList()
    {
        Node2 current=head;
        while(current.getNext()!=null)
        {
            System.out.println(current.getData());
            current=current.getNext();
        }
        System.out.println(current.getData());
    }



    private class Node2
    {
        private Node2 next ;
        private  int data;
        private Node2(int data)
        {
            next=null;
            this.data=data;
        }

        public Node2 getNext() {
            return next;
        }

        public void setNext(Node2 next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
