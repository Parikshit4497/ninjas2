package codzen;

/**
 * Created by hp on १२-०७-२०१७.
 */
public class Execute {
    public static void main(String[] args) {

        MyLinkedList mll = new MyLinkedList();



            mll.add("Oracle");
            mll.add("Microsoft");
            mll.add("Yahoo");
            mll.add("Google");
            mll.add("Dell");

            mll.remove("Yahoo");

            mll.displayLinkedList();
        }


}
