package BinarySearchTree;

import java.util.Scanner;

/**
 * Created by hp on १७-०८-२०१७.
 */
public class PrintInRange {
    public static BSTnode<Integer> createBSTtree()
    {
         Scanner s =new Scanner(System.in);
        System.out.println("Enter the data :");
        int nodedata=s.nextInt();
        BSTnode<Integer> root=null;
        while(nodedata!=-1)
        {
            root=insertBST(root,nodedata);
            System.out.println("Enter the data :");
            nodedata=s.nextInt();
        }
        return root;
    }
    public static BSTnode<Integer> insertBST(BSTnode<Integer> root,int nodedata)
    {
        if(root==null)
        {
            BSTnode<Integer> newNode= new BSTnode <>(nodedata);
            return  newNode;
        }
        if(root.data.intValue()>nodedata)
        {
            root.left=insertBST(root.left,nodedata);
            return  root;
        }
        else
        {
            root.right=insertBST(root.right,nodedata);
            return  root;
        }
    }
    public static void printBST(BSTnode<Integer> root,int k1,int k2)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>k1&&root.data<k2)
        {
            System.out.print(root.data+" ");
        }
        if(root.left!=null)
        {
            printBST(root.left,k1,k2);
        }
        if(root.right!=null)
        {
            printBST(root.right,k1,k2);
        }


    }
}
class  PrintRangeUse
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        PrintInRange p1=new PrintInRange();
        BSTnode<Integer> root=p1.createBSTtree();
        System.out.println("Enter the range in which you wish to print bst data ");
        System.out.println("Enter the first number:");
        int k1=s.nextInt();
        System.out.println("Enter the second number:");
        int k2=s.nextInt();
        p1.printBST(root,k1,k2);

    }
}