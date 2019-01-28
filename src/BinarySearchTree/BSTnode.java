package BinarySearchTree;

/**
 * Created by hp on १७-०८-२०१७.
 */
public class BSTnode <T>{
    T data;
    BSTnode<T> left;
    BSTnode <T> right;
    BSTnode(T data)
    {
        this.data=data;
        left=right=null;
    }
}
