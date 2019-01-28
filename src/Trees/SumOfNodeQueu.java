package Trees;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २८-०७-२०१७.
 */
 class SumOfNodeQueu {
    GenericTreeNode<Integer> prepareTree()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data");
        int data=s.nextInt();
        GenericTreeNode<Integer> root=new GenericTreeNode <>(data);
        Queue<GenericTreeNode<Integer>> queue =new LinkedList();
        queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode = queue.remove();
            System.out.println("Enter the number of children");
            int noOfchildren=s.nextInt();
            for(int i=0;i<noOfchildren;i++)
            {
                System.out.println("Enter"+ i +"child data ");
                int childdata =s.nextInt();
                GenericTreeNode<Integer> child=new GenericTreeNode(childdata);
                currentNode.children.add(child);
                queue.add(child);
            }
        }

       return root;
    }
    public static<T> void printTree(GenericTreeNode<T> root )
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
    public int sumofelem(GenericTreeNode<Integer> root)
    {
        int sum=0;

        Queue<GenericTreeNode<Integer>> queue =new LinkedList();
       queue.add(root);
        while(!queue.isEmpty())
        {
            GenericTreeNode<Integer> currentNode=queue.remove();
            int data =currentNode.data;
            if(currentNode.data!=null) {
                sum = sum + data;
            }
            for(int i=0;i<currentNode.children.size();i++)
            {
                queue.add(currentNode.children.get(i));
            }
        }
        return sum;
    }
}
class SumUse
{
    public static void main(String[] args) {
        SumOfNodeQueu sofn =new SumOfNodeQueu();
        GenericTreeNode<Integer> root =sofn.prepareTree();
        sofn.printTree(root);
        int sum =sofn.sumofelem(root);
        System.out.println("The result of the sum of  nodes is: " + sum);

    }
}