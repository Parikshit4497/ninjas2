package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २८-०७-२०१७.
 */
public class CountNodeQue {
    GenericTreeNode<Integer> prepareTree()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data");
        int data=s.nextInt();
        GenericTreeNode<Integer> root =new GenericTreeNode <>(data);
        Queue<GenericTreeNode<Integer>> queue= new LinkedList();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode=queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren =s.nextInt();
            for(int i=0;i<noOfchildren;i++)
            {
                System.out.println("Enter" + i +" child" );
                int childdata=s.nextInt();
                GenericTreeNode<Integer> child =new GenericTreeNode <>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }
    public static<T>  void printTree(GenericTreeNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
    public static int countNode(GenericTreeNode<Integer> root)
    {
        int count=1;
        for(int i=0;i<root.children.size();i++)
        {
            count=count+countNode(root.children.get(i) ) ;    }
        return count;
    }
}
class UseCount
{
    public static void main(String[] args) {
        CountNodeQue cnq1 =new CountNodeQue();
        GenericTreeNode<Integer> root=cnq1.prepareTree();
        cnq1.printTree(root);
        int result=cnq1.countNode(root);
        System.out.println("The number of nodes is:" + result );
    }
}