package BinarySearchTree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hp on १९-०८-२०१७.
 */
public class LCABin {
    ArrayList <Integer> path1 = new ArrayList <>();
    ArrayList <Integer> path2 = new ArrayList <>();

    public BSTnode <Integer> creatTree() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data ");
        int data = s.nextInt();
        BSTnode <Integer> root = new BSTnode <>(data);
        if (data == -1) {
            return null;
        }
        root.left = creatTree();
        root.right = creatTree();
        return root;
    }

    int LcaBina(int n1, int n2, BSTnode <Integer> root) {
        path1.clear();
        path2.clear();
        return LcaBinFind(root, n1, n2);
    }

    public int LcaBinFind(BSTnode <Integer> root, int n1, int n2) {

        if (!tracepath(root, n1, path1) || !tracepath(root, n2, path2)) {
            System.out.println(path1.size() > 0 ? "n1 exists" : "n1 does not exis");
            System.out.println(path2.size() > 0 ? "n2 exist" : "n2 does not exists ");
            return -1;
        }
        int i = 0;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i).equals(path2.get(i)))
                break;
        }
        return path1.get(i);

    }

    BSTnode <Integer> LcaBin2(BSTnode <Integer> root, int n1, int n2) {

        return trace(root, n1, n2);
    }

    BSTnode <Integer> trace(BSTnode <Integer> root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        BSTnode <Integer> lca_left = trace(root.left, n1, n2);
        BSTnode <Integer> lca_right = trace(root.right, n1, n2);

        if (lca_left != null && lca_right != null) {
            return root;
        }
        return (lca_left != null) ? lca_left : lca_right;
    }

    public static boolean tracepath(BSTnode <Integer> root, int n, ArrayList <Integer> path) {
        if (root == null) {
            return false;
        }
        path.add(root.data);
        if (root.data == n) {
            return true;
        }
        if (root.left != null && tracepath(root.left, n, path)) {
            return true;
        }

        if (root.right != null && tracepath(root.right, n, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static <T> void printBinTree(BSTnode <T> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printBinTree(root.left);
        printBinTree(root.right);

    }

}

class LCAuse {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        LCABin b1 = new LCABin();
        BSTnode <Integer> root = b1.creatTree();
        b1.printBinTree(root);
        System.out.println(" ");
        System.out.println("Enter the first number :");
        int n1 = s1.nextInt();
        System.out.println("Enter he second node :");
        int n2 = s1.nextInt();
        int result = b1.LcaBina(n1, n2, root);
        System.out.println("The least common node of two numbers is:" + result);
        BSTnode <Integer> result1 = b1.LcaBin2(root, n1, n2);
        System.out.println(" ");
        System.out.println("The lowest common ancestor is" + result1.data);
    }
}