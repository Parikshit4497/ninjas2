package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २२-०७-२०१७.
 */
public class TreeUsinQueue {
    GenericTreeNode <Integer> PrepareTreeUsinQueue() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter data ");

        int data = s.nextInt();
        GenericTreeNode <Integer> root = new GenericTreeNode <>(data);
        Queue <GenericTreeNode <Integer>> queue = new LinkedList <>();
        queue.add(root);
        while (!queue.isEmpty()) {
            GenericTreeNode <Integer> currentNode = queue.remove();
            System.out.println("No of children");
            int noOfchildren = s.nextInt();
            for (int i = 0; i < noOfchildren; i++) {
                System.out.println("Enter " + i + "th child data");
                int childdata = s.nextInt();
                GenericTreeNode <Integer> child = new GenericTreeNode <>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }

    public static <T> void printtree(GenericTreeNode <T> root) {
        System.out.println(root.data);
        for (int i = 0; i < root.children.size(); i++) {
          printtree(  root.children.get(i));
        }
    }
    public int SumOfNodes(GenericTreeNode<Integer> root) {

        Queue<GenericTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        int sum=0;
        while (!queue.isEmpty()) {
            GenericTreeNode<Integer> currentNode = queue.remove();
            int data=currentNode.data;
            if(currentNode!=null)
            {
                sum=sum+data;
            }

            for (int i = 0; i < currentNode.children.size(); i++) {
                queue.add(currentNode.children.get(i));
            }
        }

        return sum;
    }

    public static <T> int CountNodes(GenericTreeNode<T> root,int count)
    {
        for(int i=0;i<root.children.size();i++)
        {
            count++;
            CountNodes(root.children.get(i),count);

        }
        return count;
    }

}
    class treeuseage {
        public static void main(String[] args) {


            TreeUsinQueue obj1 = new TreeUsinQueue();
            GenericTreeNode <Integer> ans = obj1.PrepareTreeUsinQueue();
            obj1.printtree(ans);
            int result=obj1.CountNodes(ans,1);
            System.out.println("No of nodes is " + result);
            int result1=obj1.SumOfNodes(ans);
            System.out.println("The sum of nodes is: " + result1);
        }
    }

