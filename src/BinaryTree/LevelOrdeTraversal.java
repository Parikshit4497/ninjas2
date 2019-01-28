package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on १४-०८-२०१७.
 */
public class LevelOrdeTraversal {
    public BinaryTreeNode<Integer> createTree()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data");
        int data =s.nextInt();
        if(data==-1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode <>(data);
        root.left=createTree();
        root.right=createTree();
        return root;
    }
    public static <T> void printLevelTree(BinaryTreeNode<T> root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        printLevelTree(root.left);
        printLevelTree(root.right);

    }
    public static void levelOrder(BinaryTreeNode<Integer> root)
    {
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList <>();
        queue.add(root);
        queue.add(null);
        String s="";
        while (!queue.isEmpty())
        {
                BinaryTreeNode<Integer> currentNode=queue.poll();

                if(currentNode==null&&!queue.isEmpty())
                {
                    System.out.println(s);
                    s="";
                    queue.add(null);
                    continue;
                }
                if(currentNode==null&&queue.isEmpty())
                {
                    System.out.println(s);
                    return;
                }
                if(currentNode!=null&&!queue.isEmpty())
                {
                    s=s+currentNode.data;
                }
                if(currentNode.left!=null) {
                    queue.add(currentNode.left);
                }
                 if  (currentNode.right!=null)
                {
                    queue.add(currentNode.right);
                }

        }

    }
}
class levelUse
{
    public static void main(String[] args) {
       LevelOrdeTraversal L1=new LevelOrdeTraversal();
       BinaryTreeNode<Integer> root =L1.createTree();
       L1.printLevelTree(root);
        System.out.println("The tree in level order fashion is ");
        L1.levelOrder(root);
    }
}