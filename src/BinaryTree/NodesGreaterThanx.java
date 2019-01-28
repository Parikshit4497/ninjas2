package BinaryTree;

import java.util.Scanner;

/**
 * Created by hp on १२-०८-२०१७.
 */
public class NodesGreaterThanx {
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
    public static BinaryTreeNode<Integer> NodeGreater(BinaryTreeNode<Integer> root,int x,BinaryTreeNode<Integer> count)
    {

        if(root==null)
        {
            return count;
        }

        NodeGreater(root.left,x,count);
        NodeGreater(root.right,x,count);
        if(root.data>x) {
            count.data=count.data+1;
        }

        return count;
    }
}
class NodeUse
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        NodesGreaterThanx b1=new NodesGreaterThanx();
        BinaryTreeNode<Integer>root= b1.createTree();
        b1.printTree(root);
        System.out.println("Enter the value of x");
        int x=s.nextInt();
        BinaryTreeNode<Integer> count =new BinaryTreeNode <>(0);
        System.out.println("The number of nodes greater tha x is :" + b1.NodeGreater(root,x,count).data);
    }
}
