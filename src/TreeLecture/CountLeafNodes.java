package TreeLecture;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class CountLeafNodes {
    public GenericTreeLectNode<Integer> prepareLectTree()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=s.nextInt();
        GenericTreeLectNode<Integer> root=new GenericTreeLectNode <>(data);
        Queue<GenericTreeLectNode<Integer>> queue =new LinkedList <>();
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
    public static int countleafNodes(GenericTreeLectNode<Integer> root)
    {
        Queue<GenericTreeLectNode<Integer>> queue=new LinkedList <>();
        queue.add(root);
        int count=0;
        while(!queue.isEmpty())
        {
            GenericTreeLectNode<Integer> currentNode=queue.remove();
            if(currentNode.children.size()==0)
            {
                count++;
            }

            for(int i=0;i<currentNode.children.size();i++)
            {
                queue.add(currentNode.children.get(i));
            }

        }
        return count;
    }
}
class TreeUse
{
    public static void main(String[] args) {
        CountLeafNodes c1 =new CountLeafNodes();
        GenericTreeLectNode<Integer> root=c1.prepareLectTree();
        c1.printLectTree(root);
        System.out.println("The no of leaf node : " + c1.countleafNodes(root));
    }
}