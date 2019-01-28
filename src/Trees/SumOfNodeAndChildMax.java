package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २९-०७-२०१७.
 */
public class SumOfNodeAndChildMax {
    GenericTreeNode<Integer> prepareTree1()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=s.nextInt();
        GenericTreeNode<Integer> root =new GenericTreeNode<>(data);
        Queue<GenericTreeNode<Integer>> queue= new LinkedList <>();
        queue.add(root);
        while(!queue.isEmpty()) {
            GenericTreeNode<Integer> currentNode =queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren = s.nextInt();
            for (int i = 0; i < noOfchildren; i++) {
                System.out.println("Enter " + i + "childdata ");
                int childdata = s.nextInt();
                GenericTreeNode<Integer> child = new GenericTreeNode <>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }
    public static int maxsum(GenericTreeNode<Integer> root)
    {
        Queue<GenericTreeNode<Integer>> queue =new LinkedList <>();
        queue.add(root);

        int Max=Integer.MIN_VALUE;
        while(!queue.isEmpty())
        {
             int sum=0;
             GenericTreeNode<Integer> currentNode =queue.remove();
             int temp=currentNode.data;
             sum=sum+temp;
             for(int i=0;i<currentNode.children.size();i++)
             {
                 sum=sum+currentNode.children.get(i).data;
                 if(Max<sum)
                 {
                     Max=sum;
                 }
                 queue.add(currentNode.children.get(i));
             }
        }
        return Max;
    }
    public static<T> void printTree(GenericTreeNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
}
class sumofNc
{
    public static void main(String[] args) {
        SumOfNodeAndChildMax sm1 =new SumOfNodeAndChildMax();
        GenericTreeNode<Integer> root=sm1.prepareTree1();
        sm1.printTree(root);
        int max=sm1.maxsum(root);
        System.out.println("The nod with maximum sum of node and children is " + max);

    }

}