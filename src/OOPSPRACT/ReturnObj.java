package OOPSPRACT;

public class ReturnObj {
    int a;
    ReturnObj(int i){
        a=i;
    }
    ReturnObj incByTen(){
        ReturnObj ret=new ReturnObj(a+10);
        return ret;
    }
}
class test4{
    public static void main(String[] args) {
         ReturnObj ret=new ReturnObj(10);
         ReturnObj ret1;
        System.out.println("The value of a is " + ret.a);
         ret1=ret.incByTen();
        System.out.println("The value of a is "+ ret1.a);
    }
}