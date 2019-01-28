package BinarySearchTree;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on १८-०८-२०१७.
 */
public class BSTtoLinkedList {
    public BSTnode<Integer> createBST()
    {
        BSTnode<Integer> root=null;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data ");
        int nodedata=s.nextInt();
        while(nodedata!=-1)
        {
            root=insertBST(root,nodedata);
            System.out.println("Enter the data");
             nodedata=s.nextInt();
        }
        return  root;
    }
    public  static BSTnode<Integer> insertBST(BSTnode<Integer> root,int nodedata)
    {
        if(root==null)
        {
            BSTnode<Integer> newNode =new BSTnode <>(nodedata);
            return  newNode;
        }
        if(root.data.intValue()>nodedata)
        {
            root.left=insertBST(root.left,nodedata);
            return root;
        }
        else
        {
            root.right=insertBST(root.right,nodedata);
            return root;
        }
    }
    public static<T> void printBST(BSTnode<T>root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print("\n"+root.data+":");
        if(root.left!=null)
        {
            System.out.print(root.left.data+",");
        }
        if(root.right!=null)
        {
            System.out.print(root.right.data);
        }

        printBST(root.left);

        printBST(root.right);
    }
     public static void createLinkedList(BSTnode<Integer> root,Node<Integer> head,Node<Integer> tail)
     {
         ArrayList<Integer> bl=new ArrayList <>();
      ArrayList<Integer> al=sortList(root,bl);

         for(int i=0;i<al.size();i++) {
             if (al.get(i)!= -1) {
                 Node <Integer> newNode = new Node <>(al.get(i));
                 if (head == null) {
                     head = newNode;
                     tail = newNode;
                 } else {
                     tail.next = newNode;
                     tail = newNode;
                 }
             }
         }
         while (head!=null)
         {
             System.out.print(head.data+" ");
             head=head.next;
         }
     }
     public static ArrayList<Integer>sortList(BSTnode<Integer> root,ArrayList<Integer> bl) {

         if (root == null) {
             return bl;
         }
         sortList(root.left, bl);
         bl.add(root.data);
         sortList(root.right, bl);
         return bl;
     }
}
class LinkedListUse
{
    public static void main(String[] args) {
        BSTtoLinkedList b1 = new BSTtoLinkedList();
        BSTnode <Integer> root = b1.createBST();
        b1.printBST(root);
        System.out.print("\n");
        System.out.println("The sorted linked list from the binary search tree:");
         b1.createLinkedList(root,null,null);
    }
}