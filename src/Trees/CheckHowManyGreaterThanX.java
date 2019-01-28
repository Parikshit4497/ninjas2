package Trees;

import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * Created by hp on २८-०७-२०१७.
 */
public class CheckHowManyGreaterThanX {
    public static GenericTreeNode<Integer> prepareTree()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=s.nextInt();
        GenericTreeNode<Integer> root = new GenericTreeNode <>(data);
        System.out.println("Enter the number of children");
        int noOfchildren =s.nextInt();

        for(int i=0;i<noOfchildren;i++)
        {
            root.children.add(prepareTree());
        }
        return root;
    }
    public static<T> void printTree(GenericTreeNode<T> root)
    {
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printTree(root.children.get(i));
        }
    }
    public static int CountGreater(GenericTreeNode<Integer> root,int x,int count)
    {
        if(root==null)
        {
            return 0;
        }
               if(root.data>x)
               {
                   count++;
               }

            for(int i=0;i<root.children.size();i++)
            {
                 if(root.children.get(i).data>x)
                {
                    count++;
                }

                return CountGreater(root.children.get(i),x,count);


            }


        return count ;
    }
}
class CountGreaterThanX
{
    public static void main(String[] args) {
        CheckHowManyGreaterThanX ch1=new CheckHowManyGreaterThanX();
        Scanner s=new Scanner(System.in);
        GenericTreeNode<Integer> root1=ch1.prepareTree();
        ch1.printTree(root1);
        System.out.println("Enter the element X");
        int x=s.nextInt();
        int result =ch1.CountGreater(root1,x,0);
        System.out.println("The result is " + result );
    }
}