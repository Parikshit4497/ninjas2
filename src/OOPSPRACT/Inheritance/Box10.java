package OOPSPRACT.Inheritance;

public class Box10 {
    private double width;
    private  double length;
    private  double height;

    Box10(){
        width=-1;
        length=-1;
        height=-1;
    }
    Box10(double len){
        width=height=length=len;
    }
    Box10(double w,double h,double l){
        width=w;
        height=h;
        length=l;
    }
    Box10(Box10 O){
        width=O.width;
        length=O.length;
        height=O.height;
    }
    double volume(){
        return  length*width*height;
    }
}
class BoxWeight1 extends  Box10{
 double weight;

 BoxWeight1(){
     super();
     weight=-1;
 }
 BoxWeight1(double len){
     super(len);
     weight=len;
 }
 BoxWeight1(double w,double l,double h,double we){
     super(w,l,h);
     weight=we;
 }
 BoxWeight1(BoxWeight1 O){
     super(O);
     weight=O.weight;
 }

}
class BoxAccess{
    public static void main(String[] args) {
      BoxWeight1 mybox1=new BoxWeight1();
      BoxWeight1 mybox2=new BoxWeight1(7);
      BoxWeight1 mybox3=new BoxWeight1(7,8,9,10);
      BoxWeight1 mybox4=new BoxWeight1(mybox3);

        System.out.println("The volume of the first box is " +mybox1.volume() );
        System.out.println("the weight of the first box is " + mybox1.weight);
        System.out.println("The volume of the second box is " +mybox2.volume());
        System.out.println("The weight of the second box is " + mybox2.weight);
        System.out.println("The volume of the third box is  " + mybox3.volume());
        System.out.println("The weight of the third box is " + mybox3.weight);
        System.out.println("The volume of the fourth of box is " +mybox4.volume());
        System.out.println("The weight of the fourth of box is  "+mybox4.weight);
    }
}