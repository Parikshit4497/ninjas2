package PrioRityQueue;

/**
 * Created by hp on ०३-०८-२०१७.
 */
public  class MaxPriority<T> extends PriorityQueue<T>{

    @Override
    void shiftUp(int index) {
        int parentIndex=getparentIndex(index);
        if(parentIndex!=-1&&heap.get(parentIndex).priority<heap.get(index).priority)
        {
            swap(index,parentIndex);
            shiftUp(parentIndex);
        }
    }

    @Override
    void shiftDown(int index) {
        int LeftIndex=getLeftIndex(index);
        int RightIndex=getRightIndex(index);
        int highestpriority=-1;
        if(LeftIndex!=-1&&RightIndex!=-1)
        {
            if(heap.get(LeftIndex).priority>heap.get(RightIndex).priority)
            {
                highestpriority=LeftIndex;
            }
            else
            {
                highestpriority=RightIndex;
            }
        }
        if(LeftIndex!=-1)
        {
            highestpriority=LeftIndex;
        }
        if(highestpriority!=-1) {
            if (heap.get(highestpriority).priority > heap.get(index).priority) {
                swap(index, highestpriority);
                shiftDown(highestpriority);
            }
        }
    }

}

