package OOPSPRACT;

public class Box {

    double width;
    double height;
    double length;
}
class BoxDemo{
    public static void main(String[] args) {
        Box myBox=new Box();

        myBox.width=10;
        myBox.height=20;
        myBox.length=30;

        double vol=myBox.height*myBox.length*myBox.width;
        System.out.println("Volume is " + vol);
    }
}
