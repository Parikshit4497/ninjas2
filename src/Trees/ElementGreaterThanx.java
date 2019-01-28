package Trees;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २८-०७-२०१७.
 */
public class ElementGreaterThanx {
    GenericTreeNode<Integer> prepareTree()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=s.nextInt();
        GenericTreeNode<Integer> root=new GenericTreeNode <>(data);
        Queue<GenericTreeNode<Integer>> queue= new LinkedList ();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> CurrentNode=queue.remove();
            System.out.println("Enter the number of children ");
            int noofchildren=s.nextInt();
            for(int i=0;i<noofchildren;i++)
            {
                System.out.println("Enter" + i +" child data");
                int childdata =s.nextInt();
                GenericTreeNode<Integer> child =new  GenericTreeNode<>(childdata);
                CurrentNode.children.add(child);
                queue.add(child);
            }
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
    public  int greaterThanx(GenericTreeNode<Integer> root,int x)
    {
        Queue<GenericTreeNode<Integer>> queue =new LinkedList <>();
        queue.add(root);
        int count=0;
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode=queue.remove();
            if(currentNode.data>x) {
                count++;

            }
                for (int i = 0; i < currentNode.children.size(); i++) {
                    queue.add(currentNode.children.get(i));
                }

        }
     return    count;
    }
}
class GreaterThanX
{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       ElementGreaterThanx elg =new ElementGreaterThanx();
      GenericTreeNode<Integer> root= elg.prepareTree();
       elg.printTree(root);
        System.out.println("Enter the number x");
        int x=s.nextInt();
        int result =elg.greaterThanx(root,x);
        System.out.println("The number of elements greater than x are " + result );
    }
}