package OOPSPRACT;

public class Test {
    int a,b;
    Test(int i,int j){
        a=i;
        b=j;
    }
    boolean equalTo(Test O){
        if(O.a==a&&O.b==b){
            return true;
        }else{
            return false;
        }
    }
}
class Box7{
    public static void main(String[] args) {
        Test t1=new Test(22,100);
        Test t2=new Test(22,100);
        Test t3=new Test(-1,-1);
        System.out.println("t1==t2 "+ t1.equalTo(t2));
        System.out.println("t1==t3" +t1.equalTo(t3));
    }
}