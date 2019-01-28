package Trees;

import java.util.Scanner;

/**
 * Created by hp on २७-०७-२०१७.
 */
public class CheckIfXisPres {
    public static GenericTreeNode<Integer> prepareTree1()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data");
        int data = s.nextInt();
        GenericTreeNode<Integer> root = new GenericTreeNode<>(data);
        System.out.println("Enter the number of children :");
        int noOfchildren =s.nextInt();
        for(int i=0;i<noOfchildren;i++)
        {
            root.children.add(prepareTree1());
        }
        return root;
    }
    public static boolean search(GenericTreeNode<Integer> root,int x)
    {

        if(root==null)
        {
            return false;
        }
       if(root.data!=x) {
           for (int i = 0; i < root.children.size(); i++) {

               return search(root.children.get(i), x);
           }
       }
       else
           return true;

        return false;
    }
    public static <T>  void printTree(GenericTreeNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
}
class SearchX
{
    public static void main(String[] args) {
        CheckIfXisPres c1 = new CheckIfXisPres();
        Scanner s =new Scanner(System.in);
        GenericTreeNode <Integer> root =c1.prepareTree1();
        c1.printTree(root);
        System.out.println("Enter the element that you wish to search");
        int x=s.nextInt();
        boolean ans=c1.search(root,x);
        System.out.println("The number you wish to search is present in the tree " + ans);

    }
}