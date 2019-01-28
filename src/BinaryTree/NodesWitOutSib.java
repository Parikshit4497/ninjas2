package BinaryTree;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by hp on १३-०८-२०१७.
 */
public class NodesWitOutSib{
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
    public ArrayList<Integer> WithSib(BinaryTreeNode<Integer> root,ArrayList<Integer> al) {
        if (root == null){ return null;}

        if(root.left==null&&root.right==null)
        {
              return null;
        }
        else if(root.right!=null&&root.left==null)
        {
            al.add(root.right.data);
         }
         else if(root.left!=null&&root.right==null)
        {
          al.add(root.left.data);
        }

        WithSib(root.left,al);
        WithSib(root.right,al);
        return al;
    }
}

class NodesUse
{
     public static void main(String[] args) {


        NodesWitOutSib b1 = new NodesWitOutSib();
        BinaryTreeNode <Integer> root = b1.createTree();
         b1.printleafTree(root);
         ArrayList<Integer> al =new ArrayList <>();
         ArrayList<Integer> bl;
         bl=b1.WithSib(root,al);
         System.out.println("The nodes without sibling are" + bl);


    }
}