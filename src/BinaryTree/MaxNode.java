package BinaryTree;

import java.util.Scanner;

/**
 * Created by hp on १२-०८-२०१७.
 */
public class MaxNode {
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
    public static int FindMax(BinaryTreeNode<Integer> root,int Max)
    {

        if(root==null)
        {
            return Max;
        }
        Max=FindMax(root.left,Max);
        Max=FindMax(root.right,Max);
        if(Max<root.data)
        {
            Max=root.data;
        }
     return Max;
    }
}
class MaxUse
{
    public static void main(String[] args) {
        MaxNode b1=new MaxNode();
        BinaryTreeNode<Integer>root= b1.createTree();
        b1.printTree(root);
        int Max=Integer.MIN_VALUE;
        System.out.println("The max Node is :" + b1.FindMax(root,Max));
    }

        }