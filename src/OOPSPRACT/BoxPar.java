package OOPSPRACT;

public class BoxPar {
    double width;
    double height;
    double length;

    double volume(){
        return length*height*width;
    }
    void setDim(double l,double h,double w){
        length=l;
        height=h;
        width=w;
    }
}
class Box3{
    public static void main(String[] args) {
        BoxPar mybox1=new BoxPar();
        BoxPar mybox2=new BoxPar();
        mybox1.setDim(5,9,8);
        System.out.println("The volume of the box1 is " + mybox1.volume());
        mybox2.setDim(10,4,5);
        System.out.println("The volume of the box2 is" +mybox2.volume());
    }

}