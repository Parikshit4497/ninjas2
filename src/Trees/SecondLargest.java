package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २९-०७-२०१७.
 */
public class SecondLargest {
    GenericTreeNode<Integer>  prepareTree()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data");
        int data =s.nextInt();
        GenericTreeNode<Integer> root = new GenericTreeNode<>(data);
        Queue<GenericTreeNode<Integer>> queue = new LinkedList <>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> CurrentNode =queue.remove();
            System.out.println("Enter the number of children");
            int NoofChildren =s.nextInt();
            for(int i=0;i<NoofChildren;i++) {
                System.out.println("Enter " + i + " childdata");
                int childdata = s.nextInt();
                GenericTreeNode <Integer> child = new GenericTreeNode <>(childdata);
                CurrentNode.children.add(child);
                queue.add(child);
            }

        }

        return root;
    }
    public static int secondlargest(GenericTreeNode <Integer> root)
    {
        Queue<GenericTreeNode<Integer>> queue =new LinkedList<>();
        queue.add(root);

        int Max=Integer.MIN_VALUE;

        while(!queue.isEmpty()) {
            GenericTreeNode <Integer> currentNode = queue.remove();

            if (Max < currentNode.data) {
                Max = currentNode.data;
            }
            for (int i = 0; i < currentNode.children.size(); i++) {
                queue.add(currentNode.children.get(i));
            }
        }
        return finalans(root,Max);
    }
    public static int finalans(GenericTreeNode<Integer> root ,int Max)
    {
        Queue<GenericTreeNode<Integer>> queue =new LinkedList<>();
        int Min=Integer.MAX_VALUE;
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode =queue.remove();
         if(currentNode.data!=Max)
         {
            if(Min>(Max-currentNode.data))
            {
                Min=Max-currentNode.data;
            }
         }
            for(int i=0;i<currentNode.children.size();i++)
            {
                queue.add(currentNode.children.get(i));
            }
        }
        return Max-Min;
    }
    public static<T> void printTree(GenericTreeNode<T> root)
    {
        System.out.println(root.data );
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
}
class SecondLargestUse
{
    public static void main(String[] args) {
     SecondLargest s1=new SecondLargest();
     GenericTreeNode<Integer> root = s1.prepareTree();
     s1.printTree(root);
      int result=s1.secondlargest(root);
        System.out.println("The second largest element  is " + result);
    }
}