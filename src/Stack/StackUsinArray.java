package Stack;

/**
 * Created by hp on २१-०७-२०१७.
 *
class StackUsingArray {

    private int top;
    private int[] arr;
    int size = 0;

    public StackUsingArray() {
        arr = new int[ 10 ];
        top = -1;
    }
    public void grow()
    {
        arr=new int[2*arr.length];
    }

    public void push(int data) {
        if (size < arr.length) {
            arr[ ++top ] = data;
        }
        if (size == arr.length -1) {
            System.out.println("The stack is full please wait till it increases its size");
            System.out.println("The current stack length is "+ arr.length);
            grow();
        }
        size++;
    }

    public int pop() {
        int result = 0;
        if (size == -1) {
            System.out.println("The stack is empty");
        } else {
            size--;
            result = arr[ top-- ];
        }
        return result;
    }
}
public  class stackuse {
    public static void main(String[] args) {
        StackUsingArray stck = new StackUsingArray();

        int data1;
        System.out.println("Enter the operation you wish to perform");
        System.out.println("1:Push");
        System.out.println("2:Pop");
        System.out.println("3:Exit");
       while(1<2){
        System.out.println("Enter the option you wish to choose");

           Scanner s = new Scanner(System.in);
           int n = s.nextInt();
           switch (n) {
               case 1:
                   System.out.println("Enter the element that you wish to add");
                   data1 = s.nextInt();
                   stck.push(data1);
                   break;
               case 2:
                   System.out.println("The popped element is: " + stck.pop());
                   break;
               case 3:
                   System.exit(0);
                   break;
           }
       }


    }
}*/