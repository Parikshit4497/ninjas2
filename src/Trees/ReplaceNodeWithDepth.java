package Trees;

import sun.plugin.cache.CacheUpdateHelper;

import javax.jnlp.IntegrationService;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on ३०-०७-२०१७.
 */
public class ReplaceNodeWithDepth {
    GenericTreeNode<Integer> prepareTree()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data ");
        int data =s.nextInt();
        GenericTreeNode<Integer> root =new GenericTreeNode<>(data);
        Queue<GenericTreeNode<Integer>> queue =new LinkedList <>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> CurrentNode =queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren=s.nextInt();
            for(int i=0;i<noOfchildren;i++)
            {
                System.out.println("Enter" + i + "childata ");
                int childata=s.nextInt();
                GenericTreeNode<Integer> child =new GenericTreeNode<>(childata);
                CurrentNode.children.add(child);
                queue.add(child);
            }

        }


        return root;
    }
    GenericTreeNode<Integer>  NodewithDepth (GenericTreeNode<Integer> root) throws NullPointerException
    {


        Queue<GenericTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count =0;
        while (!queue.isEmpty()) {
            GenericTreeNode<Integer> currentNode = queue.remove();
            if(root == currentNode)
            {
                currentNode.data=0;
                count++;
            }
            if(currentNode==null&&!queue.isEmpty()){
                count++;
                queue.add(null);
                continue;
            }else if(currentNode==null && queue.isEmpty()){
                return root;
            }


            for (int i = 0; i < currentNode.children.size(); i++) {
                currentNode.children.get(i).data=count;
                queue.add(currentNode.children.get(i));
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
}
class DepthUse
{
    public static void main(String[] args) {
        ReplaceNodeWithDepth r1= new ReplaceNodeWithDepth();
        GenericTreeNode<Integer> root =r1.prepareTree();
        r1.printTree(root);
        System.out.println("The nodes after replacing with depth are");
        GenericTreeNode<Integer> root1 =r1.NodewithDepth(root);
        r1.printTree(root1);
    }
}