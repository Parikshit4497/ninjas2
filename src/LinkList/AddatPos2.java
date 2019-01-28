package LinkList;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class AddatPos2 {

    private Node3 head;
    AddatPos2(int data)
    {
        head=new Node3(data);
    }
    public void Add(int data)
    {
        Node3 newNode=new Node3(data);
        Node3 current=head;
        while(current.getNext()!=null)
        {
            current=current.getNext();
        }
        current.setNext(newNode);
    }
    void AddatPos(int pos,int data2)
    {
        Node3 newNode =new Node3(data2);
        Node3 current=head;
        int count=0;
        while(current.getNext()!=null)
        {

            if(count==pos-1)
            {
                newNode.setNext(current.getNext());
                current.setNext(newNode);

                return;
            }
            current=current.getNext();
            count++;

        }
    }

    public void printlist()
    {
        Node3 current=head;

        while(current.getNext()!=null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println(current.getData());
    }

    private class Node3
    {
        private Node3 next;
        private int data;
        public Node3(int data)
        {
            next=null;
            this.data=data;
        }

        public Node3 getNext() {
            return next;
        }

        public void setNext(Node3 next) {
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

