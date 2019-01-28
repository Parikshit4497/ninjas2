package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on १४-०८-२०१७.
 */
public class PrintAlevelOderLinked {
    public BinaryTreeNode<Integer> createTree()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data :");
        int data=s.nextInt();
        if(data==-1)
        {
            return null;
        }

        BinaryTreeNode<Integer> root =new BinaryTreeNode <>(data);
        root.left=createTree();
        root.right=createTree();
        return root;
    }
    <T> void printleafTree(BinaryTreeNode<T> root)
    {
        if(root==null)
        {
            return;
        }

        System.out.println(root.data);
        printleafTree(root.left);
        printleafTree(root.right);
    }
    public static ArrayList<Node<BinaryTreeNode<Integer>>> printLevelwise(BinaryTreeNode<Integer> root)
    {   Queue<BinaryTreeNode<Integer>> queue =new LinkedList <>();
        queue.add(root);
        queue.add(null);
        Node<BinaryTreeNode<Integer>> head=null;
        Node<BinaryTreeNode<Integer>> tail=null;
        ArrayList<Node<BinaryTreeNode<Integer>>> bl=new ArrayList <>();
        while(!queue.isEmpty())
        {   BinaryTreeNode<Integer> currentNode = queue.remove();
            if(currentNode==null&&!queue.isEmpty())
            {   bl.add(head);
                queue.add(null);
                head=null;
                tail=null;
                continue ;}
            else if(currentNode==null&&queue.isEmpty())
            {
                bl.add(head);
                return bl;
            }
            else if(currentNode!=null&&!queue.isEmpty())
            {    Node<BinaryTreeNode<Integer>> newNode=new Node <>(currentNode);
                 if(head==null)
                 {   tail=newNode;
                     head=newNode;
                 }else
                 {   tail.next=newNode;
                     tail=newNode;
                 }
            }
            if(currentNode.left!=null)
            {
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null)
            {
                queue.add(currentNode.right);
            }
        }
        return bl;
    }
}
class LevelOrderLinkUse
{
    public static void main(String[] args) {
        PrintAlevelOderLinked p1= new PrintAlevelOderLinked();
        BinaryTreeNode<Integer> root=p1.createTree();
        p1.printleafTree(root);
       ArrayList <Node <BinaryTreeNode <Integer>>> al= p1.printLevelwise(root);
       Node<BinaryTreeNode<Integer>> result=null;
        System.out.println("The tree in level order linked list form is");
       for(int i=0;i<al.size();i++)
       {
           result=al.get(i);
           while(result!=null)
           {
               System.out.print(result.data.data+" ");
               result=result.next;
           }
           System.out.print("\n");
       }
    }
}