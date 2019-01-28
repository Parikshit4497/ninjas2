package BinaryTree;

import java.util.Scanner;

/**
 * Created by hp on १२-०८-२०१७.
 */
public class BinarySum {

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
    public static int SumOfNodes(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.data + SumOfNodes(root.left)+SumOfNodes(root.right);
    }
}
class BinarySumUse
{
    public static void main(String[] args) {
        BinarySum b1=new BinarySum();
        BinaryTreeNode<Integer>root= b1.createTree();
        b1.printTree(root);
        System.out.println("The sum of nodes is:" + b1.SumOfNodes(root)) ;
    }
}
