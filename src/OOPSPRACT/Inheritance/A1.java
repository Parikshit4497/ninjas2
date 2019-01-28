package OOPSPRACT.Inheritance;

public class A1 {
    int i;
    private int j;
    void setij(int a,int b){
        i=a;
        j=b;
        }
}

class B1 extends  A1{
  int total ;
  void sum(){
      // variable j is private in class A1 total=i+j;
  }
}
class Access{
    public static void main(String[] args) {
        B1 subOb=new B1();
        subOb.setij(3,4);
        subOb.sum();
        System.out.println("The total is :" + subOb.total );
    }
}