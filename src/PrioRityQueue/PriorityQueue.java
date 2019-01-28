package PrioRityQueue;

import java.util.ArrayList;

/**
 * Created by hp on ०३-०८-२०१७.
 */
public abstract class PriorityQueue<T> {
    ArrayList<PriorityQueueNode<T>> heap;
    final static int Max_Size=10;
    PriorityQueue()
    {
        this.heap=new ArrayList <>();
    }
    T remove()
    {
        T data =heap.get(0).data;
        heap.set(0,heap.get(size()));
        heap.remove(size());
        shiftDown(0);
        return data ;
    }
    void swap(int index,int highestpriority)
    {
        PriorityQueueNode<T> Node =heap.get(index);
        heap.set(index,heap.get(highestpriority));
        heap.set(highestpriority,Node);
    }
    void add(T data ,int priority)
    {
        PriorityQueueNode<T> newNode =new PriorityQueueNode <>(data,priority);
        heap.add(newNode);
        shiftUp(size());
    }
    public int size()
    {
        return heap.size()-1;
    }
    public int getRightIndex(int index)
    {
        int Rightindex=2*index+2;
        if(Rightindex>size())
        {
            return -1;
        }
        return Rightindex;
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
    abstract void shiftUp(int index);
    abstract void shiftDown(int index);
}
