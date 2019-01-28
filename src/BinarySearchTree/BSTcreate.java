package BinarySearchTree;


import java.util.Scanner;

/**
 * Created by hp on १७-०८-२०१७.
 */
public class BSTcreate{
    public BSTnode<Integer> createBSTtree()
    {
        Scanner s=new Scanner(System.in);
        BSTnode<Integer> root=null;
        System.out.println("Enter the data of the node:");
        int nodedata=s.nextInt();
        while(nodedata!=-1)
        {
            root=insertBST(root,nodedata);
            System.out.println("Enter the data:");
            nodedata=s.nextInt();
        }
        return root;
    }
    public static BSTnode<Integer> insertBST(BSTnode<Integer> root,int nodedata)
    {
        if(root==null)
        {
            BSTnode<Integer> newNode=new BSTnode <>(nodedata);
            return newNode;
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
    public static <T> void printTree(BSTnode<T> root)
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
        printTree(root.left);
        printTree(root.right);
    }
}
class BSTUse
{
    public static void main(String[] args) {
        BSTcreate b1 =new BSTcreate();
        BSTnode<Integer> root= b1.createBSTtree();
        b1.printTree(root);
    }
}
