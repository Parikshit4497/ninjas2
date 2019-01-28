package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २९-०७-२०१७.
 */
public class StructurallyIdentical {
    GenericTreeNode <Integer> prepareTree1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data ");
        int data = s.nextInt();
        GenericTreeNode <Integer> root = new GenericTreeNode <>(data);
        Queue <GenericTreeNode <Integer>> queue = new LinkedList <>();
        queue.add(root);
        while (!queue.isEmpty()) {
            GenericTreeNode <Integer> currentNode = queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren = s.nextInt();
            for (int i = 0; i < noOfchildren; i++) {
                System.out.println("Enter " + i + "childdata ");
                int childdata = s.nextInt();
                GenericTreeNode <Integer> child = new GenericTreeNode <>(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }
    public static boolean StruSame(GenericTreeNode<Integer> root1,GenericTreeNode<Integer> root2)
    {
        Queue<GenericTreeNode<Integer>> queue1=new LinkedList <>();
        Queue<GenericTreeNode<Integer>> queue2=new LinkedList<>();
        queue1.add(root1);
        queue2.add(root2);
        boolean result=false;
        while(!queue1.isEmpty()&&!queue2.isEmpty())
        {
            GenericTreeNode<Integer> CurrentNode1=queue1.remove();
            GenericTreeNode<Integer> CurrentNode2=queue2.remove();
            if(CurrentNode1.data==CurrentNode2.data)
            {
                result=true;
            }
            else
            {
                result =false ;
                break;
            }

            for(int i=0;i<CurrentNode1.children.size();i++)
            {
                 queue1.add(CurrentNode1.children.get(i));
            }
            for(int j=0;j<CurrentNode2.children.size();j++)
            {
                queue2.add(CurrentNode2.children.get(j));
            }

        }
        return result ;
    }
    public static<T> void printTree(GenericTreeNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
}
class StructurallyUse
{
    public static void main(String[] args) {
     StructurallyIdentical s1=new StructurallyIdentical();
        StructurallyIdentical s2=new StructurallyIdentical();
        System.out.println("Prepare first Tree");
     GenericTreeNode<Integer> root1=s1.prepareTree1();
        System.out.println("Prepare Secaond tree");
     GenericTreeNode<Integer> root2 =s2.prepareTree1();
     s1.printTree(root1);
     s2.printTree(root2);
      boolean result =s1.StruSame(root1,root2);
        System.out.println("the two trees are structurally same " + result  );


    }
}