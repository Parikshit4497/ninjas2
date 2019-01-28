package Trees;

import java.util.Scanner;

/**
 * Created by hp on २७-०७-२०१७.
 */
public class GenericSumOfNodes {
    public static GenericTreeNode<Integer> createTree()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data");
        int data=s.nextInt();
        GenericTreeNode<Integer> root = new GenericTreeNode<>(data);
        System.out.println("Enter the no of children");
        int noOfchildren=s.nextInt();
        for(int i=0;i<noOfchildren;i++)
        {
            root.children.add(createTree());
        }
        return root;
    }
    public static <T> void printTree(GenericTreeNode<T> root )
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
    public static int sumOfNodes(GenericTreeNode<Integer> root)
    {
             int sum=0;
             sum=sum+root.data;
        for(int i=0;i<root.children.size();i++)
        {
            sum=sum+root.children.get(i).data;

            sumOfNodes(root.children.get(i));
        }

        return sum;
    }
}
class TreeNodeSum
{
    public static void main(String[] args) {
        GenericSumOfNodes g1=new GenericSumOfNodes();
       GenericTreeNode<Integer> root= g1.createTree();
        g1.printTree(root);
       int result= g1.sumOfNodes(root);
        System.out.println("The sum of the two nodes is  " + result);
    }
}