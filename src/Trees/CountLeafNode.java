package Trees;

import java.util.Queue;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by hp on २९-०७-२०१७.
 */
public class CountLeafNode {
    GenericTreeNode<Integer>  preparTree()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=s.nextInt();
        GenericTreeNode<Integer> root =new GenericTreeNode <>(data);
        Queue<GenericTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode =queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren =s.nextInt();
            for(int i=0;i<noOfchildren;i++)
            {
                System.out.println("Enter "+ i +" data");
                int childdata =s.nextInt();
                GenericTreeNode<Integer> child =new GenericTreeNode<>(childdata);
                currentNode.children.add(child);
                queue.add(child);

            }
        }
        return root;
    }
    public static int CountNodes1(GenericTreeNode<Integer> root)
    {
        Queue<GenericTreeNode<Integer>>  queue =new LinkedList <>();
        queue.add(root);
        int count=0;
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> CurrentNode = queue.remove();
            if(CurrentNode.children.size()==0)
            {
                count++;
            }
            for(int i=0;i<CurrentNode.children.size();i++)
            {

                queue.add(CurrentNode.children.get(i));
            }
        }
        return count;
    }
    public static<T> void printTree(GenericTreeNode<T> root )
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
}
class UseCount1
{
    public static void main(String[] args) {
      CountLeafNode c1 =new CountLeafNode();
      GenericTreeNode<Integer> root =c1.preparTree();
      c1.printTree(root);
      int result=c1.CountNodes1(root);
        System.out.println("Enter the number of leafnodes " + result);
    }
}