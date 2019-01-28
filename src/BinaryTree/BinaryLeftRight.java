package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on १७-०८-२०१७.
 */
public class BinaryLeftRight {
    public static BinaryTreeNode<Integer> BinaryTreeCreate()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=s.nextInt();
        BinaryTreeNode<Integer> root=new BinaryTreeNode <>(data);
        if(data==-1)
        {
            return null;
        }
        root.left=BinaryTreeCreate();
        root.right=BinaryTreeCreate();
        return root;
    }
    public static void PrintTree(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        PrintTree(root.left);
        PrintTree(root.right);

    }
    public static void printLeftRight(BinaryTreeNode<Integer>  root)
    {
        Queue<BinaryTreeNode<Integer>> queue =new LinkedList <>();
        queue.add(root);
        queue.add(null);
        int count=0;
        String s="";
        while(!queue.isEmpty())
        {
            BinaryTreeNode<Integer> currentNode=queue.remove();
            if(currentNode==null&&!queue.isEmpty())
            {
                System.out.println(s);
                s="";
                count++;
                queue.add(null);
            }
            else if(currentNode==null&&queue.isEmpty())
            {
                System.out.println(s);
                continue;
            }
            if(count%2==0&&currentNode!=null)
            {
                s=s+currentNode.data+" ";
                if (currentNode.right!=null)
                {
                    queue.add(currentNode.right);
                }
                if(currentNode.left!=null)
                {
                    queue.add(currentNode.left);
                }
            }
            else if(count%2==1&&currentNode!=null)
            {
                s=s+currentNode.data+" ";
                if(currentNode.left!=null)
                {
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    queue.add(currentNode.right);
                }
            }
        }

    }
}
class LeftRightUs
{
    public static void main(String[] args) {
          BinaryLeftRight m1=new BinaryLeftRight();
          BinaryTreeNode<Integer> root=m1.BinaryTreeCreate();
          m1.PrintTree(root);
          m1.printLeftRight(root);

    }
}