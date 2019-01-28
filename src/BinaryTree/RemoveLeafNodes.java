package BinaryTree;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on १४-०८-२०१७.
 */
public class RemoveLeafNodes {
        BinaryTreeNode <Integer> createTree() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the data ");
            int data = s.nextInt();
            if (data == -1) {
                return null;
            }
            BinaryTreeNode <Integer> root = new BinaryTreeNode <>(data);
            root.left = createTree();
            root.right = createTree();
            return root;
        }

        <T> void printTree(BinaryTreeNode <T> root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            printTree(root.left);
            printTree(root.right);

        }
       public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
           if (root == null) {
               return null;
           }
           if(root.left==null&&root.right==null)
           {
               root =null ;
               return root;
           }

         root.left=removeLeaves(root.left);
          root.right= removeLeaves(root.right);
           return root;
       }
    }

class RemoveUse
{
    public static void main(String[] args) {
           RemoveLeafNodes r1=new RemoveLeafNodes();
           BinaryTreeNode<Integer> root=r1.createTree();
           r1.printTree(root);
           BinaryTreeNode<Integer> root1=r1.removeLeaves(root);
        System.out.println("The tree after removing leave nodes is");
           r1.printTree(root1);
    }
}
