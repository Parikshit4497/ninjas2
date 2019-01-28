package OOPSPRACT.StaticandInterface;

interface Stack1{
   void pushes(int num);
   int pops();
}
class stack implements  Stack1{
    int stack1[];
    int tos=0;
     stack(int size){
         stack1=new int[size];
         tos=-1;
     }
     public void  pushes(int num){
         if(tos==stack1.length-1){
             System.out.println("The stack is full");
         }else{
             stack1[++tos]=num;
         }
     }
     public int pops(){
         if(tos<=0){
             System.out.println("The stack is empty ");
         }else{
             --tos;
         }
         return stack1[tos];
     }
}
public class IFTest2 {
    public static void main(String[] args) {
        stack s1=new stack(8);
        stack s2=new stack(10);
        int i=0;
        for(i=0;i<8;i++){
            s1.pushes(i);
        }
        for(i=0;i<10;i++){
            s2.pushes(i);
        }
        for(i=0;i<8;i++){
            System.out.println("The number that pops is" + s1.pops());
        }
        for(i=0;i<10;i++){
            System.out.println("The number that pops is " +s2.pops());
        }
    }
}
