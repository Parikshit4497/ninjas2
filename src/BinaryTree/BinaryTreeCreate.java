package BinaryTree;

import TreeLecture.SumOfAllNodes;

import java.util.Scanner;

public class BinaryTreeCreate {
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
}
class BinarUse
{
    public static void main(String[] args) {
        BinaryTreeCreate b1=new BinaryTreeCreate();
       BinaryTreeNode<Integer>root= b1.createTree();
       b1.printTree(root);
     }
}