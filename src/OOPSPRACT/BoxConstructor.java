package OOPSPRACT;


public class BoxConstructor {
    double width;
    double height;
    double length;
    BoxConstructor(){
        System.out.println("Creating box constructor ");
        width=10;
        length=20;
        height=30;
    }
    double volume(){
        return width*length*height;
    }
}
class ConstBox{
    public static void main(String[] args) {
        BoxConstructor mybox=new BoxConstructor();

        System.out.println("the volume of box is"+mybox.volume());

    }
}