package TreeLecture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class CountNodes {
    public GenericTreeLectNode<Integer> prepareLectTree()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=s.nextInt();
        GenericTreeLectNode<Integer> root=new GenericTreeLectNode <>(data);
        Queue<GenericTreeLectNode<Integer>> queue =new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            GenericTreeLectNode<Integer> currentNode =queue.remove();
            System.out.println("Enter the number of children :");
            int noOfchildren=s.nextInt();
            for(int i=0;i<noOfchildren;i++)
            {
                System.out.println("Enter " + i +" childdata" );
                int childdata=s.nextInt();
                GenericTreeLectNode<Integer> child=new GenericTreeLectNode <>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root ;
    }
    public static <T> void printLectTree(GenericTreeLectNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printLectTree(root.children.get(i));
        }
    }
    public static int countNodes(GenericTreeLectNode<Integer> root)
    {
        Queue<GenericTreeLectNode<Integer>> queue=new LinkedList <>();
        queue.add(root);
        int count=1;
        while(!queue.isEmpty())
        {
            GenericTreeLectNode<Integer> currentNode=queue.remove();


            for(int i=0;i<currentNode.children.size();i++)
            {
                count++;
                queue.add(currentNode.children.get(i));
            }

        }
        return count;
    }
}
class CountUse
{
    public static void main(String[] args) {
        CountNodes s1=new CountNodes();
        GenericTreeLectNode<Integer> root=s1.prepareLectTree();
        s1.printLectTree(root);
        System.out.println("The sum of all nodes is :" + s1.countNodes(root));
    }
}
