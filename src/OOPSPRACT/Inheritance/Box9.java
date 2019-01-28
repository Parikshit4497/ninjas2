package OOPSPRACT.Inheritance;

public class Box9 {
    double width;
    double length;
    double height;
    Box9(){
        width=-1;
        length=-1;
        height=-1;
    }
    Box9(double len){
        width=length=height=len;
    }
    Box9(double h,double l,double w){
        height=h;
        length=l;
        width=w;
    }
    Box9(Box9 O){
      width=O.width;
      length=O.length;
      height=O.height;
    }
    double volume(){
        return  length*width*height;
    }
}
class BoxWeight extends Box9 {

    double weight;
    BoxWeight(){
        width=-1;
        length=-1;
        height=-1;
        weight=-1;
    }
    BoxWeight(double len,double we){
        weight=we;
        width=length=height=len;
    }
    BoxWeight(double w,double l,double h, double we){

        weight=w;
        length=l;
        height=h;
        weight=we;
    }
    BoxWeight(BoxWeight o){
        weight=o.weight;
        height=o.height;
        length=o.length;
        width=o.width;
    }
}
class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight mybox1=new BoxWeight(3,7,8,9);
        BoxWeight mybox2=new BoxWeight(7,9);
        BoxWeight mybox3=new BoxWeight();
        BoxWeight mybox4=new BoxWeight(mybox1);

        System.out.println("The volume of first box is " + mybox1.volume());
        System.out.println("The weight of first box is " + mybox1.weight);
        System.out.println("The volume of second box is " + mybox2.volume());
        System.out.println("The weight of second box is " + mybox2.weight);
        System.out.println("The volume of the third is " +mybox3.volume());
        System.out.println("The weight of the third of box is :"+ mybox3.weight);
        System.out.println("The volume of the fourth box is " + mybox4.volume());
        System.out.println("The weight of the fourth box is " +mybox4.weight );
        Box9 plainbox =new Box9();
        double vol=plainbox.volume();
        System.out.println("Volume of plainbox is" + vol);
        /*System.out.println("The weight of the plainbox is "  +plainbox.weight);
         The weight variable is not present in Box9 class
*/

    }
}