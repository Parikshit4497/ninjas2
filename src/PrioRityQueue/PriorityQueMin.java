package PrioRityQueue;

import java.util.ArrayList;

/**
 * Created by hp on ०४-०८-२०१७.
 */
public abstract class  PriorityQueMin<T> {
    ArrayList<PriorityQueueNode<T>> heap;
    final static int Max_Size=10;
    public PriorityQueMin()
    {
        this.heap=new ArrayList<>();
    }
    T remove()
    {
        T data=heap.get(0).data;
        heap.set(0,heap.get(size()));
        heap.remove(size());
        shiftDown(0);
        return data ;
    }
    public void swap(int index,int minpriority)
    {
        PriorityQueueNode<T> node =heap.get(index);
        heap.set(index,heap.get(minpriority));
        heap.set(minpriority,node);
    }
    public void addmin(T data ,int priority)
    {
        PriorityQueueNode<T> newNode = new PriorityQueueNode <>(data,priority);
        heap.add(newNode);
        shiftUp(size());
    }
    public int getRightIndex(int index)
    {
        int rightIndex=2*index+2;
        if(rightIndex>size())
        {
            return -1;
        }
       return rightIndex;
    }
    public int getLeftIndex(int index)
    {
        int LeftIndex=2*index+1;
        if(LeftIndex>size())
        {
          return -1;
        }
        return LeftIndex;
    }
    public int getparentIndex(int index)
    {
        return (index-1)/2;
    }
    public int size()
    {
        return  heap.size()-1;
    }
    abstract void shiftDown(int index);
    abstract  void shiftUp(int index);
}
