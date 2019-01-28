package PrioRityQueue;

/**
 * Created by hp on ०४-०८-२०१७.
 */
public class MinPriority<T> extends PriorityQueMin<T> {
    @Override
    void shiftDown(int index) {
        int leftIndex=getLeftIndex(index);
        int rightIndex=getRightIndex(index);
        int minpriority=-1;
        if(leftIndex!=-1&&rightIndex!=-1)
        {
            if(heap.get(leftIndex).priority<heap.get(rightIndex).priority)
            {
                minpriority=leftIndex;
            }
            else
            {
                minpriority=rightIndex;
            }
        }
        if(leftIndex!=-1)
        {

            minpriority=leftIndex;
        }
        if(minpriority!=-1)
        {
            if(heap.get(minpriority).priority<heap.get(index).priority)
            {
                swap(index,minpriority);
                shiftUp(minpriority);
            }
        }

    }

    @Override
    void shiftUp(int index) {
       int parentIndex=getparentIndex(index);
       if(parentIndex!=-1&&heap.get(index).priority<heap.get(parentIndex).priority)
       {
           swap(index,parentIndex);
           shiftUp(index);
       }
    }

}
