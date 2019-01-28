package BinarySearchTree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hp on १९-०८-२०१७.
 */
public class CreateNdInserDupNode {
    public static BSTnode<Integer> createBST()
    {
        Scanner s=new Scanner(System.in);
        BSTnode<Integer> root=null;
        System.out.println("Enter the data ");
        int nodedata=s.nextInt();
        while(nodedata!=-1)
        {
            root=insertBST(root,nodedata) ;
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
    public static <T> void printBST(BSTnode<T> root)
    {
     if(root==null)
     {
         return;
     }
        System.out.print("\n" +root.data+":");
     if(root.left!=null)
     {
         System.out.print(root.left.data+",");
     }
     if(root.right!=null)
     {
         System.out.print(root.right.data);
     }
     printBST(root.left);
     printBST(root.right);
    }
    public static BSTnode<Integer>  insertDuplicate(BSTnode<Integer> root)
    {
        ArrayList<Integer> al=new ArrayList <>(25);
        ArrayList<Integer> bl=createList(root,al);
        BSTnode<Integer> root1=null;
        int count=0;
        for(int i=0;i<bl.size();i++)
        {
            while(count<=1)
            {
                root1=creatDup(root1,bl.get(i));
                count++;
            }
            count=0;

        }
      return root1;
    }
    public static ArrayList<Integer>createList(BSTnode<Integer> root, ArrayList<Integer> al)
    {
        if(root==null)
        {
         return al;
        }
        al.add(root.data);
        createList(root.left,al);

        createList(root.right,al);
        return al;
    }
    public static BSTnode<Integer> creatDup(BSTnode<Integer> root1,int data )
    {
        if(root1==null)
        {   BSTnode<Integer> newNode=new BSTnode <>(data);
            return newNode;
        }

        if(root1.data.intValue()>=data)
        {

            root1.left=creatDup(root1.left,data);
            return root1;
        }
        else
        {
            root1.right=creatDup(root1.right,data);
            return root1;
        }



    }
}
class DuplicateUse
{
    public static void main(String[] args) {
        CreateNdInserDupNode c1=new CreateNdInserDupNode();
        BSTnode<Integer>root=c1.createBST();
        c1.printBST(root);
        BSTnode<Integer> result=c1.insertDuplicate(root);
        System.out.println("The tree after inserting duplicates is");
        c1.printBST(result);
    }
}