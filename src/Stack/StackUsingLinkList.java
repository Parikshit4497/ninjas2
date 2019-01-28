package Stack;

import java.util.Scanner;

/**
 * Created by hp on २१-०७-२०१७.
 */
 class StackUsingLinkList {
   private Node top=null;

   private int size=0;
  void push(int data)
  {
      Node newNode =new Node(data);
      if(top==null)
      {
          top=newNode;
      }
      else
      {
          newNode.next=top;
          top=newNode;
      }
      size++;
  }
   int  pop()
  {
      int data2=0;
      if(size>1) {
          data2 = top.data;
          top = top.next;
          size--;

      }
      else
      {
          System.out.println("The stack is empty");
      }
     return data2;
  }

}
class stackcreate
{
    public static void main(String[] args) {
        StackUsingLinkList stck=new StackUsingLinkList();
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
}