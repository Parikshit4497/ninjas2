package BinaryTree;

import java.util.Scanner;

/**
 * Created by hp on १२-०८-२०१७.
 */
public class FindNode {
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

    public static boolean FindX(BinaryTreeNode <Integer> root, int x,boolean answer) {

        if (root == null) {
            return false;
        }
        if(root.data.equals(x)) {
            return true;
        }
        answer = FindX(root.left, x, answer);
        if (answer == false)
            answer = FindX(root.right, x, answer);

        return answer;
    }
}
class FindUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        FindNode b1 = new FindNode();
        BinaryTreeNode <Integer> root = b1.createTree();
        b1.printTree(root);
        System.out.println("Enter the value of x");
        int x = s.nextInt();
        boolean answer = false;
        System.out.println("The number x is present in the tree :" + b1.FindX(root, x, answer));
    }
}
