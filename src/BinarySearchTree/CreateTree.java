package BinarySearchTree;

import java.util.Scanner;

/**
 * Created by hp on १७-०८-२०१७.
 */
public class CreateTree {
    public static BSTnode<Integer> createBSTTree(int arr[],int startindex,int endindex)
    {
        if(startindex>endindex)
        {
            return null;
        }
        int mid=startindex+(endindex-startindex)/2;

            BSTnode<Integer> temp=new BSTnode <>(arr[mid]);
            if(startindex<endindex) {
                temp.left = createBSTTree(arr, 0, mid - 1);
                temp.right = createBSTTree(arr, mid + 1, endindex);
            }

        return temp;
    }

    public  static<T> void printBStTree(BSTnode<T> root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print("\n"+root.data+":");
        if(root.left!=null)
        {
            System.out.print(root.left.data+",");

        }
        if(root.right!=null)
        {
            System.out.print(root.right.data);
        }
        printBStTree(root.left);
        printBStTree(root.right);
    }

}
class createTreeuse
{
    public static void main(String[] args) {
        CreateTree c1=new CreateTree();
        Scanner s1=new Scanner(System.in);
        int n=0;

        System.out.println("Enter the number of elements in the array:");
         n=s1.nextInt();
         int arr[]=new int[n];
        System.out.println("Enter the elements of the array");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]= s1.nextInt();
        }
        int startindex=0;
        int endindex=arr.length-1;
        BSTnode<Integer> root=c1.createBSTTree(arr,startindex,endindex);
        c1.printBStTree(root);

    }
}
