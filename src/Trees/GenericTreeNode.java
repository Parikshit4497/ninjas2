package Trees;

import java.util.ArrayList;

/**
 * Created by hp on २०-०७-२०१७.
 */
public class GenericTreeNode<T> {
    T data;
    ArrayList<GenericTreeNode<T>> children;
    public GenericTreeNode( T data)
    {
        this.data=data;
         children=new ArrayList<>();
    }
}
