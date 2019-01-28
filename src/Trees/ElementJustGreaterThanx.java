package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २९-०७-२०१७.
 */
public class ElementJustGreaterThanx {
    GenericTreeNode<Integer> prepareTree()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data");
        int data =s.nextInt();
        GenericTreeNode<Integer> root =new GenericTreeNode <>(data);
        Queue<GenericTreeNode<Integer>> queue=new LinkedList <>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode =queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren=s.nextInt();
            for(int i=0;i<noOfchildren;i++)
            {
                System.out.println("Enter" + i +" child data" );
                int childdata=s.nextInt();
                GenericTreeNode<Integer> child =new GenericTreeNode<>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }
    public static<T> void printTree(GenericTreeNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i< root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
    public static int greater(GenericTreeNode<Integer> root,int x)
    {
        Queue<GenericTreeNode<Integer>> queue =new LinkedList <>();
        queue.add(root);
        int Min =Integer.MAX_VALUE;
        int temp=0;
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode =queue.remove();
                if((currentNode.data-x)<Min&&(currentNode.data-x)>0)
                {    temp=currentNode.data;
                     Min=(currentNode.data-x);
                }
                for(int i=0;i<currentNode.children.size();i++)
                {
                    queue.add(currentNode.children.get(i));
                }

        }
        return temp;
    }
}
class ElementGreater
{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        ElementJustGreaterThanx eg1=new ElementJustGreaterThanx();
        GenericTreeNode<Integer> root =eg1.prepareTree();
        eg1.printTree(root);
        System.out.println("Enter the element x");
        int x=s.nextInt();
        int result=eg1.greater(root,x);
        System.out.println("The elemnt just greater than x is " + result);
    }
}