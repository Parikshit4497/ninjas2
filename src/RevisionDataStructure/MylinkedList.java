package RevisionDataStructure;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class MylinkedList {

    private node head;
    MylinkedList(int  data)
    {
        head=new node(data);
    }
    public void add(int data)
    {
        node newNode=new node(data);
        node current=head;
        while(current.getNext()!=null)
        {
            current=current.getNext();
        }
        current.setNext(newNode);
    }
    public void printlist()
    {
        node current=head;
        while(current.getNext()!=null)
        {
            System.out.println(current.getData());
            current=current.getNext();
        }
        System.out.println(current.getData());

    }

    private class node
    {
        private node next;
        private int data;
        public node(int data )
        {
            next=null;
            this.data=data;
        }

        public node getNext() {
            return next;
        }

        public void setNext(node next) {
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
