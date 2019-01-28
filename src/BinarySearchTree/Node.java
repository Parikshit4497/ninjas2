package BinarySearchTree;

/**
 * Created by hp on १८-०८-२०१७.
 */
public class Node<T> {
    Node<T>  next;
    T data;
    Node(T data)
    {
        this.data=data;
        next=null;
    }
}
