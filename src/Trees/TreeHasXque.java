package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २८-०७-२०१७.
 */
public class TreeHasXque{
    GenericTreeNode<Integer> prepareTree()
    {
        Scanner  s =new Scanner(System.in);
        System.out.println("Enter the  data ");
        int data =s.nextInt();
        GenericTreeNode<Integer> root =new GenericTreeNode<>(data);
        Queue<GenericTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode =queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren =s.nextInt();
            for(int i=0;i<noOfchildren;i++)
            {
                System.out.println("Enter" + i +"data");
                int childdata=s.nextInt();
                GenericTreeNode<Integer> child =new GenericTreeNode <>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }
    public static <T> void printTree(GenericTreeNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
    public static boolean searchX(GenericTreeNode<Integer> root,int x)
    {
        Queue<GenericTreeNode<Integer>> queue =new LinkedList ();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode =queue.remove();

            if(currentNode.data==x)
            {
                return true;
            }
            for(int i=0;i<currentNode.children.size();i++)
            {
             queue.add(currentNode.children.get(i));
            }
        }
        return false;
    }
}
class Xpresent
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        TreeHasXque Hx = new TreeHasXque();
        GenericTreeNode<Integer> root =Hx.prepareTree();
        Hx.printTree(root);
        System.out.println("Enter the number you wish to search");
        int x=s.nextInt();
        boolean ans=Hx.searchX(root,x);
        System.out.println("The number is present " + ans);
    }
}