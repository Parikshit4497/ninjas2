package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class Implement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of nodes in the list");
        int n=s.nextInt();
        System.out.println("Enter the first element of the linked list ");
        int data1=s.nextInt();

        MylinkedList M11=new MylinkedList(data1);
        System.out.println("Enter the subsequent elements of the list");
        for(int i=0;i<n-1;i++) {
            M11.add(s.nextInt());
        }
        M11.printList();
    }
}
