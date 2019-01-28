package BinaryTree;

import Trees.GenericTree;

import java.util.Scanner;

/**
 * Created by hp on १४-०८-२०१७.
 */
public class ConstructPreInorder {
    static int preindex=0;
    public static void takeArray(int pr[],int in[])
    {   Scanner s1=new Scanner(System.in);
        int startindex=0;
        int endindex=0;
        System.out.println("Enter the elemnets in preorder array");
        for(int i=0;i<pr.length;i++) {

            pr[ i ] = s1.nextInt();
        }
        System.out.println("Enter the elemnts in inorder array :");
        for(int i=0;i<in.length;i++)
        {
            in[i]=s1.nextInt();
        }
        startindex=0;
        endindex=pr.length-1;


        BinaryTreeNode <Integer> root1=  createBinTree( pr,in,startindex, endindex);
      printPreInTree(root1);
    }
    public static BinaryTreeNode<Integer> createBinTree(int pr[],int in[],int startindex,int endindex)
    {
       if(startindex>endindex)
       {
           return null;
       }

         int      data = pr[ preindex++ ];

        BinaryTreeNode <Integer>    root = new BinaryTreeNode <>(data);


       int index=search(data,in);
        root.left=createBinTree(pr,in,startindex,index-1) ;
        root.right=createBinTree(pr,in,index+1,endindex);


       return root;
    }
    public static int search(int data,int in[])
    {
        int ans=0;
        for(int i=0;i<in.length;i++)
        {
            if(in[i]==data)
            {
                ans=i;
            }
        }
        return ans;
    }
    public static<T> void printPreInTree(BinaryTreeNode<T>  root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        printPreInTree(root.left);
        printPreInTree(root.right);

    }
}
class PreInUse
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ConstructPreInorder c1 =new ConstructPreInorder();
        System.out.println("Enter the number of elements in the tree:");
        int m=s.nextInt();
        int pr[] =new int[m];
        int in[]= new int [m];
        c1.takeArray(pr,in);


    }
}