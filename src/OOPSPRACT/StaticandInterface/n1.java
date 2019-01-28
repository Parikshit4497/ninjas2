package OOPSPRACT.StaticandInterface;

public interface n1 {
  int var =10;
  void show();
}
class impl implements n1{
    @Override
    public void show() {
        System.out.println("The method has been implemented ");
    }
}
class implDemo{
    public static void main(String[] args) {
        impl im=new impl();
        im.show();
        System.out.println("The value of variable is  " + im.var);
    }
}