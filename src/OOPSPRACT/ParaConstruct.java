package OOPSPRACT;

public class ParaConstruct {
    double width;
    double height;
    double length;
    ParaConstruct(double w,double h,double l){
        width=w;
        height=h;
        length=l;
    }
    double volume(){
        return  width*height*length;
    }
}
class ParaBox4{
    public static void main(String[] args) {
        ParaConstruct p1=new ParaConstruct(7,8,9);
        System.out.println("The volume of box is" + p1.volume());
    }
}