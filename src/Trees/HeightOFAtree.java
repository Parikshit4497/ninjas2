package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on ३१-०७-२०१७.
 */
public class HeightOFAtree {
    GenericTreeNode<Integer> prepareTree()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data");
        int data=s.nextInt();
        GenericTreeNode<Integer> root =new GenericTreeNode <>(data);
        Queue<GenericTreeNode<Integer>> queue =new LinkedList <>();
        queue.add(root);
        while(!queue.isEmpty())
        {
           GenericTreeNode<Integer> currentNode =queue.remove();
            System.out.println("Enter the number of children");
            int NoOfchildren =s.nextInt();
            for(int i=0;i<NoOfchildren;i++)
            {
                System.out.println("Enter "+ i +" children");
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
    <T> int Height(GenericTreeNode<T> root) {
        Queue <GenericTreeNode <T>> queue = new LinkedList <>();
        queue.add(root);
        queue.add(null);
        int count=0;
        while(!queue.isEmpty())
        {
            GenericTreeNode<T> currentNode =queue.remove();
            if(currentNode==null&&!queue.isEmpty())
            {
                count++;
                queue.add(null);
                continue;
            }
            else if(currentNode==null && queue.isEmpty())
            {
             return count;
            }
            else if(currentNode!=null&&!queue.isEmpty()) {
                for (int i = 0; i < currentNode.children.size(); i++) {
                    queue.add(currentNode.children.get(i));
                }
            }

        }
        return count;
    }
}
class HeightUse
{
    public static void main(String[] args) {
        HeightOFAtree h1=new HeightOFAtree();
        GenericTreeNode<Integer> root =h1.prepareTree();
        h1.printTree(root);
        int ans=h1.Height(root);
        System.out.println(" The height of the tree is " + ans);
    }
}