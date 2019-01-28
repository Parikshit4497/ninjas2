package BinaryTree;

import java.util.Scanner;

/**
 * Created by hp on १२-०८-२०१७.
 */
public class CountNoOfLeafNodes{
    BinaryTreeNode<Integer> createTree()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=s.nextInt();
        if(data==-1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode <>(data);
        root.left=createTree();
        root.right=createTree();
        return root;
    }
    <T> void printTree(BinaryTreeNode<T> root)
    {
        if(root==null)
        {
            return ;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
    public static BinaryTreeNode<Integer>  CountLeaf(BinaryTreeNode<Integer> root,BinaryTreeNode<Integer> leaf1,BinaryTreeNode<Integer> leaf2,BinaryTreeNode<Integer> count)
    {
        if(root==null)
        {
            return null;
        }
        leaf1=CountLeaf(root.left,leaf1,leaf2,count) ;
        leaf2=CountLeaf(root.right,leaf1,leaf2,count);
        if(leaf1==null&&leaf2==null)
        {
            count.data=count.data+1;
        }
      return count;
    }
}
class CountUse
{
    public static void main(String[] args) {
        CountNoOfLeafNodes b1=new CountNoOfLeafNodes();
        BinaryTreeNode<Integer>root= b1.createTree();
        b1.printTree(root);
        BinaryTreeNode<Integer> leaf1=new BinaryTreeNode <>(Integer.MIN_VALUE);
        BinaryTreeNode<Integer> leaf2=new BinaryTreeNode <>(Integer.MIN_VALUE);
        BinaryTreeNode<Integer> count=new BinaryTreeNode <>(0);
        System.out.println("The number of leaf nodes is:" + b1.CountLeaf(root,leaf1,leaf2,count).data);
    }

}