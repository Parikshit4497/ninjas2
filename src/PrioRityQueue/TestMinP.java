package PrioRityQueue;

import java.util.Scanner;

/**
 * Created by hp on ०४-०८-२०१७.
 */
public class TestMinP {
    public static void main(String[] args) {
        PriorityQueMin<Integer> queue=new MinPriority <>();
        Scanner s =new Scanner(System.in);
        while(1<2) {
            System.out.println("1:Add");
            System.out.println("2:Remove:");
            System.out.println("3:Exit");
            System.out.println("Enter the option you wish to choose");
            int n=s.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the number of elements you wish to add");
                    int no=s.nextInt();
                    for(int i=0;i<no;i++)
                    {
                        System.out.println("Enter the data ");
                        int data =s.nextInt();
                        System.out.println("Enter the priority ");
                        int priority=s.nextInt();
                        queue.addmin(data,priority);
                    }
                    break;
                case 2:
                    System.out.println(queue.remove());
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
