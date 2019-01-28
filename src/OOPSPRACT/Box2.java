package OOPSPRACT;

public class Box2 {
    double width;
    double height;
    double length;

    double volume(){
        return  length*height*width;
    }
}
 class  Box2Demo{
    public static void main(String[] args) {
        Box2 mybox1=new Box2();
        Box2 mybox2=new Box2();

        mybox1.width=10;
        mybox1.length=5;
        mybox1.height=2;
        double vol1=mybox1.volume();
        mybox2.length=3;
        mybox2.height=9;
        mybox2.width=10;
        double vol2=mybox2.volume();
        System.out.println("The volume of the first box is"+ vol1);
        System.out.println("The volume of the second box is " +vol2);

    }
}
