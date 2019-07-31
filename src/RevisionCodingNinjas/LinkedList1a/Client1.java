package RevisionCodingNinjas.LinkedList1a;

public class Client1 {
    public static void main(String[] args) throws Exception {
        LinkedList1 linkedList1=new LinkedList1();
       linkedList1.addAtLast(10);
        linkedList1.addAtLast(20);
        linkedList1.addAtLast(30);
        linkedList1.addAtLast(40);
        linkedList1.addAtFirst(5);
        try {
            linkedList1.addAtIndex(4,20);
        } catch (Exception e) {
            e.printStackTrace();
        }
        linkedList1.display();
    }
}
