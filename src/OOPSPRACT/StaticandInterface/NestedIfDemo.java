package OOPSPRACT.StaticandInterface;
class A{
    public  interface NestedIF{
    boolean isNotNegative(int x);
    }
}
class B implements  A.NestedIF{

    public boolean isNotNegative(int x){
        return x<0? false:true;
    }
}
public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIF nif=new B();
        if(nif.isNotNegative(-10)){
            System.out.println("The no is not negative ");
        }else{
            System.out.println("The no is negative ");
        }
    }
}
