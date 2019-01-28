package TreeLecture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class MaxDataNode {
    public GenericTreeLectNode<Integer> prepareLectTree() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = s1.nextInt();
        GenericTreeLectNode <Integer> root = new GenericTreeLectNode <>(data);
        Queue <GenericTreeLectNode <Integer>> queue = new LinkedList <>();
        queue.add(root);
        while (!queue.isEmpty()) {
            GenericTreeLectNode <Integer> currentNode = queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren = s1.nextInt();
            for (int i = 0; i < noOfchildren; i++) {
                System.out.println("Enter " + i + "childdata");
                int childdata = s1.nextInt();
                GenericTreeLectNode <Integer> child = new GenericTreeLectNode <>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }
    public int MaxDataNode(GenericTreeLectNode<Integer> root)
    {
        Queue<GenericTreeLectNode<Integer>> queue=new LinkedList <>();
        queue.add(root);
        int max=Integer.MIN_VALUE;
        while(!queue.isEmpty())
        {
            GenericTreeLectNode<Integer> currentNode=queue.remove();

            if(currentNode.data>max)
            {
                max=currentNode.data;
            }
            for(int i=0;i<currentNode.children.size();i++)
            {
                queue.add(currentNode.children.get(i));
            }
        }
        return max;
    }
    public static<T> void printLectTree(GenericTreeLectNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printLectTree(root.children.get(i));
        }
    }

}
class MaxDataNodeUse
{
    public static void main(String[] args) {
        MaxDataNode m1= new MaxDataNode();
        GenericTreeLectNode<Integer> root=m1.prepareLectTree();
        m1.printLectTree(root);

        System.out.println("The maximum data node is: " + m1.MaxDataNode(root));
    }
}