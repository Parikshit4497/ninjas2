package BinaryTree;

/**
 * Created by hp on १२-०८-२०१७.
 */
public class BinaryTreeNode <T>{
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    T data;
    BinaryTreeNode(T data)
    {
        this.data=data;
        left=right=null;
    }
}
