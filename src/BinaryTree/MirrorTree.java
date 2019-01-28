package BinaryTree;

import java.util.Scanner;

/**
 * Created by hp on १३-०८-२०१७.
 */
public class MirrorTree {
     public  BinaryTreeNode<Integer> prepareTree()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data :");
        int data=s.nextInt();
        if(data==-1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode <>(data);

        root.left=prepareTree();
        root.right=prepareTree();

       return root;
    }
    <T> void printTree(BinaryTreeNode<T> root)
    {
         if(root==null)
         {
             return;
         }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
      public <T> void  mirror(BinaryTreeNode<T> root )
     {
           if(root==null)
           {
               return ;
           }
         mirror(root.left);
         mirror(root.right);
         BinaryTreeNode<T> temp=root.left;

         root.left=root.right;
         root.right=temp;

     }
}
class MirrorUse
{
    public static void main(String[] args) {
        MirrorTree m1= new MirrorTree();
        BinaryTreeNode<Integer>  root=m1.prepareTree();
        System.out.println("The tree that you entered is");
        m1.printTree(root);
        System.out.println("The tree after mirror image is");
        m1.mirror(root);
        m1.printTree(root);
    }
}