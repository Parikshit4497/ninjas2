package TreeLecture;

import java.util.ArrayList;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class GenericTreeLectNode <T>{

    T data ;
    ArrayList<GenericTreeLectNode<T>> children;
    GenericTreeLectNode(T data)
    {
        this.data=data;
        children=new ArrayList <>();
    }

}
