package TreeLecture;

import Trees.GenericTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class NodesGreaterThanX {
    GenericTreeLectNode<Integer> prepareTree()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data ");
        int data =s.nextInt();
        GenericTreeLectNode<Integer> root =new GenericTreeLectNode<>(data);
        Queue<GenericTreeLectNode<Integer>> queue= new LinkedList <>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeLectNode<Integer>  currentNode =queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren=s.nextInt();

            for(int i=0;i<noOfchildren;i++) {
                System.out.println("Enter " + i + "childdata");
                int childdata=s.nextInt();
                GenericTreeLectNode<Integer> child=new GenericTreeLectNode<>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }
    public static<T> void  printLectTree(GenericTreeLectNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printLectTree(root.children.get(i));
        }
    }
    public static int greaterThanX(GenericTreeLectNode<Integer> root,int x)
    {
        Queue<GenericTreeLectNode<Integer>> queue =new LinkedList <>();
        queue.add(root);
        int count=0;
        while(!queue.isEmpty())
        {
            GenericTreeLectNode<Integer> currentNode = queue.remove();
            if(currentNode.data>x)
            {
                count++;
            }
            for(int i=0;i<currentNode.children.size();i++)
            {
                queue.add(currentNode.children.get(i));
            }
        }
       return  count;
    }
}
class GreaterThanx
{
    public static void main(String[] args) {
        NodesGreaterThanX n1=new NodesGreaterThanX();
        Scanner s=new Scanner(System.in);
        GenericTreeLectNode<Integer> root=n1.prepareTree();
        n1.printLectTree(root);
        System.out.println("Enter the value of x");
        int x=s.nextInt();
        System.out.println("The nummber of elements greater than x is:" + n1.greaterThanX(root,x));

    }

}
