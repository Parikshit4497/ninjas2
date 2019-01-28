package TreeLecture;

import Trees.GenericTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on १२-०८-२०१७.
 */
public class PrintLevelWise {
    public GenericTreeLectNode<Integer> prepareTree() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data");
        int data = s.nextInt();
        GenericTreeLectNode <Integer> root = new GenericTreeLectNode <>(data);
        Queue <GenericTreeLectNode <Integer>> queue = new LinkedList <>();
        queue.add(root);
        while (!queue.isEmpty()) {
            GenericTreeLectNode <Integer> currentNode = queue.remove();
            System.out.println("Enter the number of children ");
            int noOfchildren = s.nextInt();
            for (int i = 0; i < noOfchildren; i++) {
                System.out.println("Enter" + i + " child data");
                int childdata = s.nextInt();
                GenericTreeLectNode <Integer> child = new GenericTreeLectNode <>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }
    public void level(GenericTreeLectNode<Integer> root)
    {
        Queue<GenericTreeLectNode<Integer>> queue=new LinkedList <>();
        queue.add(root);
        queue.add(null);
         String s="";
        while(!queue.isEmpty())
        {

            GenericTreeLectNode<Integer> currentNode=queue.remove();
            if(currentNode==null&&!queue.isEmpty())
            {   queue.add(null);
                System.out.println(s);
                s="";
                continue;
            }
            else if (currentNode==null&&queue.isEmpty())
            {
                System.out.println(s);
                return ;
            }
            else if(currentNode!=null&&!queue.isEmpty())
            {
                s=s+currentNode.data+" ";
            }

                for (int i = 0; i < currentNode.children.size(); i++) {
                    queue.add(currentNode.children.get(i));
                }

        }
    }
    public static <T> void printLectTree(GenericTreeLectNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printLectTree(root.children.get(i));
        }
    }
}
class levelwiseUse
{
    public static void main(String[] args) {
        PrintLevelWise p1=new PrintLevelWise();
          GenericTreeLectNode<Integer> root=p1.prepareTree();
          p1.printLectTree(root);
        System.out.println("The level wise print is:");
          p1.level(root);
    }
}