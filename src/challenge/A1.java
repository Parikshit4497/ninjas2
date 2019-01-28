package challenge;

public class A1 {
    int i;
    private int j;
    void setij(int x,int y)
    {
        i=x;
        j=y;
    }

}
class B1 extends A1{
    int total;
    void sum()
    {
        /*total=i+j/*this gives error as private member cannot be inherited*/;
    }
}
class Access
{
    public static void main(String[] args) {
          B1 subObj=new B1 ();
          subObj.setij(5,7);
          subObj.sum();
        System.out.println("Total is" +subObj.total);
    }
}