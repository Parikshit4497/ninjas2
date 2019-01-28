package Trees;

import java.util.Scanner;

public class TreeCreate {

    public static GenericTreeNode <Integer> prepareTree() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the data :");
        int data = s.nextInt();
        GenericTreeNode <Integer> root = new GenericTreeNode <>(data);
        System.out.println("Enter the no of children");
        int noofchildren = s.nextInt();
        for (int i = 0; i < noofchildren; i++) {
            root.children.add(prepareTree());
        }

        return root;
    }

    public static <T> void printTree(GenericTreeNode <T> root) {
        System.out.println(root.data);
       /*  for (GenericTreeNode <T> child : root.children)
         {  printTree(child);}*/

        for (int i = 0; i < root.children.size(); i++) {
            printTree(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        GenericTreeNode <Integer> root = prepareTree();
        printTree(root);
    }
}

