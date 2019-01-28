package Stack;


import java.util.Scanner;

public class QueueUsingArray {

    int front = -1, rear = -1;
    int size = 0;
    int arr[];

    public QueueUsingArray() {
        arr = new int[ 10 ];
    }

    void enque(int data) {
        if (size == arr.length - 1) {
            System.out.println("The queue is full");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
            }
            arr[ rear ] = data;
            rear = (rear + 1) % arr.length;
            size++;

        }
    }

    int dequeue() {
        int data = 0;
        if (front == -1 || front > rear) {
            System.out.println("The queue is empty");
        } else {
            data = arr[ front++ ];
        }
        return data;
    }
}
 class QueueUseage {
    public static void main(String[] args) {

        QueueUsingArray obj1 =new QueueUsingArray();


        System.out.println("Enter the option you wish to choose");
        System.out.println("1:Enqueue");
        System.out.println("2:Dequeue");
        System.out.println("3:Exit");

        while(2>1)
        {System.out.println("Enter the option you wish to choose");

          Scanner s =new Scanner(System.in);
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter the data you wish to insert");
                    obj1.enque(s.nextInt());
                    break;
                case 2:
                    System.out.println("The data that is dequed is " + obj1.dequeue());
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
     }

}

