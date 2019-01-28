package TreeLecture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class NodeAtDepthK {
    public GenericTreeLectNode<Integer> prepareLectTree() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = s1.nextInt();
        GenericTreeLectNode <Integer> root = new GenericTreeLectNode <>(data);
        Queue<GenericTreeLectNode <Integer>> queue = new LinkedList<>();
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
    public void nodesAtK(GenericTreeLectNode<Integer> root,int x) {
        Queue <GenericTreeLectNode <Integer>> queue = new LinkedList <>();
        queue.add(root);
        queue.add(null);
        int count =1;
        while (!queue.isEmpty()) {
            GenericTreeLectNode <Integer> currentNode = queue.remove();
            if(currentNode==root&&x==0)
            {
                System.out.println(currentNode.data);
            }
            if(currentNode==null&&!queue.isEmpty())
            {
                ++count;
                queue.add(null);
                continue;
            }
            else if (currentNode==null&&queue.isEmpty())
            {
                return ;
            }
            if(count==x) {

                    for (int i = 0; i < currentNode.children.size(); i++) {
                        System.out.print(currentNode.children.get(i).data + " ");
                        queue.add(currentNode.children.get(i));
                    }
                }
            else
            {
                for (int i = 0; i < currentNode.children.size(); i++) {
                    queue.add(currentNode.children.get(i));
                }
            }

        }
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
class NodedeothUse
{
    public static void main(String[] args) {
        NodeAtDepthK n1=new NodeAtDepthK();
        Scanner s=new Scanner(System.in);
        GenericTreeLectNode<Integer> root=n1.prepareLectTree();
        n1.printLectTree(root);
        System.out.println("Enter the value of x");
        int x=s.nextInt();
        n1.nodesAtK(root,x);

    }
}