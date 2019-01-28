package RevisionDataStructure;

import java.util.ArrayList;

/**
 * Created by hp on २६-०७-२०१७.
 */

public class GenericTreeNode<T> {
  T data;
  int level;
  ArrayList<GenericTreeNode<T>> children;
    GenericTreeNode (T data)
  {
      this.data=data;
      children=new ArrayList <>();
  }
}
