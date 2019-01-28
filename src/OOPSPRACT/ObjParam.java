package OOPSPRACT;

public class ObjParam{
    double width;
    double length;
    double height;
    ObjParam(){
        length=-1;
        width=-1;
        height=-1;
    }
    ObjParam(double len){
        length=width=height=len;
    }
    ObjParam(double l,double h ,double w){
        length=l;
        width=w;
        height=h;
    }
    ObjParam(ObjParam O){

        length=O.length;
        width=O.length;
        height=O.width;
    }
    double volume(){
        return  length*width*height;
    }
}
class Box8{
    public static void main(String[] args) {
      ObjParam o1=new ObjParam(7);
      ObjParam o2=new ObjParam(7,8,9);
      ObjParam o3=new ObjParam();
      ObjParam o4=new ObjParam(o2);

        System.out.println("The value of object1" + o1.volume());
        System.out.println("The value of  object2  " + o2.volume());
        System.out.println("The value of object3" + o3.volume());
        System.out.println("The value of object4 " +o4.volume());

    }
}
