package BinarySearchTree;

import java.util.Scanner;

/**
 * Created by hp on २०-०८-२०१७.
 */
public class LowestBst {
    public BSTnode<Integer> createBst()
    {
        Scanner s= new Scanner(System.in);
        BSTnode<Integer> root=null;
        System.out.println("Enter the data :");
        int nodedata=s.nextInt();
        while(nodedata!=-1)
        {
            root=insertBST(root,nodedata);
            System.out.println("Enter the data ");
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
    public static void printBSTTree(BSTnode<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print("\n" + root.data+":");
        if(root.left!=null)
        {
            System.out.print(root.left.data+",");
        }
        if(root.right!=null)
        {
            System.out.print(root.right.data);
        }
        printBSTTree(root.left);
        printBSTTree(root.right);
    }
    public static BSTnode<Integer> findAncestor(BSTnode<Integer> root,int n1,int n2)
    {
        if(root==null)
        {
            return null;
        }
        if((root.data>n1&&root.data>n2))
        {
            return findAncestor(root.left,n1,n2);
        }

            if((root.data<n1&&root.data<n2))
            {
                return findAncestor(root.right,n1,n2);
            }

            return root;
    }
}
class BSTLCaUse
{
    public static void main(String[] args) {
        LowestBst l1 =new LowestBst();
        Scanner s1=new Scanner(System.in);
        BSTnode<Integer> root=l1.createBst();
        l1.printBSTTree(root);
        System.out.println(" ");
        System.out.println("Enter the first number whose lowest common ancestor you wish to find  :");
       int n1=s1.nextInt();
        System.out.println("Enter the secon number whose lowest common ancestor you wish to find :");
        int n2= s1.nextInt();
        BSTnode<Integer> result=l1.findAncestor(root,n1,n2);
        System.out.println("The lowest common ancestotr is:" + result.data);
    }
}