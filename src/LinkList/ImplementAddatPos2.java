package LinkList;

import java.util.Scanner;

/**
 * Created by hp on १४-०७-२०१७.
 */
public class ImplementAddatPos2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of nodes in the list");
        int n=s.nextInt();
        System.out.println("Enter the first element of the linked list ");
        int data1=s.nextInt();

        AddatPos2 M11=new AddatPos2(data1);
        System.out.println("Enter the subsequent elements of the list");
        for(int i=0;i<n-1;i++) {
            M11.Add(s.nextInt());
        }
        M11.printlist();
        System.out.println("Enter the number you wish to insert ");
        int data2=s.nextInt();
        System.out.println("Enter the position you wish to insert thr number ");
        int pos=s.nextInt();
        M11.AddatPos(pos,data2);
        M11.printlist();
    }
}
