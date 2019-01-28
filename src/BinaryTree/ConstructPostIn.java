package BinaryTree;

import java.util.Scanner;

/**
 * Created by hp on १४-०८-२०१७.
 */
class Index
{
   static int index;
}
public class ConstructPostIn {

    public static void takeArray(int pr[],int in[],Index pindex)
    {   Scanner s1=new Scanner(System.in);
        int startindex=0;
        int endindex=0;
        System.out.println("Enter the elemnets in postorder array");
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
        BinaryTreeNode <Integer> root1=  createBinTree( pr,in,startindex, endindex,pindex);
        printProInTree(root1);
    }
    public static BinaryTreeNode<Integer> createBinTree(int pr[],int in[],int startindex,int endindex,Index pindex)
    {
        if(startindex>endindex)
        {
            return null;
        }


        BinaryTreeNode <Integer>    root = new BinaryTreeNode <>(pr[ pindex.index ]);
        (pindex.index)--;
        if(startindex==endindex)
        {
            return root;
        }
        int index=search(root.data,in);
        root.right=createBinTree(pr,in,index+1,endindex,pindex);
        root.left=createBinTree(pr,in,startindex,index-1,pindex) ;



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
    public static<T> void printProInTree(BinaryTreeNode<T>  root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        printProInTree(root.left);
        printProInTree(root.right);

    }
}
class ConstructPostUse
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Index pindex=new Index() ;
        ConstructPostIn c1 =new ConstructPostIn();
        System.out.println("Enter the number of elements in the tree:");
        int m=s.nextInt();
        int pr[] =new int[m];
        int in[]= new int [m];
        pindex.index=m-1;
        c1.takeArray(pr,in,pindex);


    }
}
