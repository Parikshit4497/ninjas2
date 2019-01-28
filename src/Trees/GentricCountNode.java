package Trees;

import java.util.Scanner;

/**
 * Created by hp on २६-०७-२०१७.
 */
public class GentricCountNode {
    public static GenericTreeNode<Integer> createTree()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=s.nextInt();
        GenericTreeNode<Integer> root =new GenericTreeNode<>(data);
        System.out.println("Enter the no of children");
        int noofchildren =s.nextInt();
        for(int i=0;i<noofchildren;i++)
        {
            root.children.add(createTree());
        }
        return root;
    }
    public static<T> void printree(GenericTreeNode<T> root )
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
           printree( root.children.get(i));
        }
    }
    public static <T>  int counttree(GenericTreeNode<T> root)
    {
        int count=1;

        for(int i=0;i<root.children.size();i++)
        {
            count=count + counttree(root.children.get(i));
        }
        return count;
    }
}
class TreeCreate1
{
    public static void main(String[] args) {
        GentricCountNode g1 =new GentricCountNode();
        GenericTreeNode<Integer> root=g1.createTree();
        g1.printree(root);
        int result=g1.counttree(root);
        System.out.println("The total number of nodes is " + result );
    }
}