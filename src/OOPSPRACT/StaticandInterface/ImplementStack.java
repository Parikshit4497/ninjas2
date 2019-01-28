package OOPSPRACT.StaticandInterface;
interface Stack{
    void push(int x);
    int pop();
}
class stackStruct implements Stack {
    int stack[];
    int tos = 0;

    stackStruct(int size) {
        stack = new int[ size ];
        tos = -1;
    }

    public void push(int num) {
        if (tos == stack.length-1) {
            System.out.println("The stack is full");
        }
        else{
            stack[ ++tos ] = num;
        }
    }

    public int pop() {
        if (tos <= 0) {
            System.out.println("The stack is empty");
            return  0;
        } else
            tos--;
        return stack[tos];
    }
}
class IFTest{
    public static void main(String[] args) {
        stackStruct s1=new stackStruct(5);
        stackStruct s2=new stackStruct(8);
        int i=0;
        for(i=0;i<5;i++){
            s1.push(i);
        }
        for(i=0;i<8;i++){
            s2.push(i);
        }
        for(i=0;i<5;i++){
            System.out.println("The value of popped number is "+ s1.pop());
        }
        for(i=0;i<8;i++){
            System.out.println("The value of popped number is " +s2.pop());
        }
    }



}
public class ImplementStack  {
}
