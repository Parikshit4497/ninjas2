package RevisionCodingNinjas.LinkedList1a;

public class Client {
    public static void main(String[] args) throws Exception {
        LinkedList linkedList=new LinkedList();
        linkedList.addDataLast(10);
        linkedList.addDataLast(20);
        linkedList.addDataLast(30);
        linkedList.addDataLast(40);
        linkedList.addFirst(5);
        linkedList.display();
        System.out.println();
        try {
            System.out.println(linkedList.getFirst());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(linkedList.getAtIndex(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            linkedList.addAt(5,4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        linkedList.display();
        System.out.println();
        try {
            System.out.println( linkedList.removeFirst());
        } catch (Exception e) {
            e.printStackTrace();
        }
        linkedList.display();
        System.out.println(  linkedList.removeLast());
        linkedList.display();
    }
}
