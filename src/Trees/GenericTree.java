package Trees;

import java.util.Scanner;

/**
 * Created by hp on २६-०७-२०१७.
 */
public class GenericTree {
    public static GenericTreeNode<Integer> treecreate()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the data");
        int data=s.nextInt();
        GenericTreeNode<Integer> root =new GenericTreeNode<>(data);
        System.out.println("Enter the no of children");
        int noofchildren=s.nextInt();
        for(int i=0;i<noofchildren;i++)
        {
            root.children.add(treecreate());
        }
        return root;
    }
    public static <T> void printtree(GenericTreeNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printtree(root.children.get(i));
        }
    }

}
  class treeuse
{
    public static void main(String[] args) {
      GenericTree g1 =new GenericTree();
      GenericTreeNode<Integer> root1=g1.treecreate();
      g1.printtree(root1);
    }
}