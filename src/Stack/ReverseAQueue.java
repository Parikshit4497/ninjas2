package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by hp on २४-०७-२०१७.
 */
class ReverseAQueue {
    static int n=0;
public static Queue Create(Queue que)
{
    int i;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of elements in the queue");
    n=s.nextInt();
    for( i=0;i<n;i++)
    {
        que.add(s.nextInt());
    }
    return que;
}
public static Queue reverse(Queue que1)
{
    Integer data1=null;

    int i;
    int j=0;
    for(i=0;i<que1.size();i++)
    {
        data1= (Integer) que1.poll();
        que1.add(data1);
        j++;
    }
    data1=null;
    int arr[] = new int[j];
    for(i=0;i<j;i++)
    {
        data1=(Integer)que1.poll();
        arr[i]=data1;
    }
    for(i=j-1;i>=0;i--)
    {
        que1.add(arr[i]);
    }

return que1;
}

}
class QueueUse
{
    public static void main(String[] args) {
        Queue que = new LinkedList();
        ReverseAQueue re =new ReverseAQueue();
        System.out.println("Create a Queue");
       Queue que1= re.Create(que);
       Queue que2=re.reverse(que1);
        System.out.println("The que after reversing is " + que2 );
    }
}