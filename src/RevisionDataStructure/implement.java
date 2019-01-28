package RevisionDataStructure;

import java.util.Scanner;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class implement {
    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number of elements in th list  ");
        int n=s1.nextInt();
        System.out.println("Enter the first element in the list:");
        int data1=s1.nextInt();
        MylinkedList m11=new MylinkedList(data1);
        System.out.println(" eneter the subsequent elements in the list :");
        for(int i=0;i<n-1;i++)
        {
            m11.add(s1.nextInt());
        }
        System.out.println("the list is");
        m11.printlist();
    }
}
