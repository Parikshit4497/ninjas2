package OOPSPRACT;

public class Box1 {
    double width;
    double height;
    double length;
}
class Box1Demo{
    public static void main(String[] args) {
        Box1 mybox1=new Box1();
        Box1 mybox2=new Box1();

        mybox1.height=20;
        mybox1.length=30;
        mybox1.width=40;

        double vol1= mybox1.height*mybox1.length*mybox1.width;
        System.out.println("The volume of cube is " + vol1);

        mybox2.width=10;
        mybox2.length=20;
        mybox2.height=30;

        double vol2=mybox2.width*mybox2.length*mybox2.height;
        System.out.println("The volume of the cube is "+ vol2);
    }
}
