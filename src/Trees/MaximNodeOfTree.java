package Trees;

import java.util.Scanner;

/**
 * Created by hp on २७-०७-२०१७.
 */
 class MaximNodeOfTree {
    public static GenericTreeNode<Integer> prepareTree()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data ");
        int data =s.nextInt();
        GenericTreeNode <Integer > root = new GenericTreeNode<>(data);
        System.out.println("Enter the number of children:");
        int noOfchildren=s.nextInt();
        for(int i=0;i<noOfchildren;i++)
        {
            root.children.add(prepareTree());
        }
        return root;
    }
    public static<T> void printTree(GenericTreeNode<T> root)
    {
       System.out.println(root.data);
     for(int i=0;i<root.children.size();i++)
     {
         printTree(root.children.get(i));
     }
    }
    public static int MaxNode(GenericTreeNode<Integer> root)
    {

        if(root==null)
        {
            return 0;
        }
        int temp=0;
       int  max=root.data;

        for(int i=0;i<root.children.size();i++)
        {
             temp=MaxNode(root.children.get(i));
          if(max<temp)
              max=temp;
        }

        return max;

    }
}
class treeformation
{
    public static void main(String[] args) {
        MaximNodeOfTree Ma1 =new MaximNodeOfTree();
      GenericTreeNode  root=  Ma1.prepareTree();
      Ma1.printTree(root);
      int Ans =Ma1.MaxNode(root);
        System.out.println("The maximum value of the nodes is " + Ans);
    }
}
