package OOPSPRACT.StaticandInterface;

public interface CallBack {
    void callBack(int param);
}
class client implements  CallBack{
    public  void callBack(int param){
        System.out.println("The value of parameter passed is " + param);
    }
    public void show(){
        System.out.println("Implementing show function ");
    }
}
class TestCallBack{
    public static void main(String[] args) {
        client c1=new client();
        c1.callBack(42);
        c1.show();
    }
}