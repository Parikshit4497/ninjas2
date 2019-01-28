package challenge;

public class Box {
    double width;
    double height;
    double length;
    Box()
    {
        length=-1;
        width=-1;
        height=-1;
    }
    Box(double w,double h,double l)
    {
        length=l;
        width=w;
        height=h;
    }
    Box(double len)
    {
        length=width=height=len;
    }
    Box(Box ob)
    {
        length=ob.length;
        width=ob.height;
        height=ob.height;
    }
    double volume()
    {
        return  width*length*height;
    }
}
class Boxweight extends Box{
    double weight;
    Boxweight(double we,double w,double h,double l )
    {
        length=l;
        weight=we;
        width=w;
        height=h;
    }
}
class DemoBoxWeight
{
    public static void main(String[] args) {
        Boxweight b1=new Boxweight(20,30,70,90);
        Boxweight b2=new Boxweight(5,7,8,9);
        Box b3=new Box(5,7,9);
        Box  b4=new Box(6);
        Box b5=new Box();
        double vol=b1.volume();
        System.out.println("The volume of the first box is:" + vol);
        System.out.println("The weight of the first box is:"+ b1.weight);
         vol=b2.volume();
        System.out.println("The volume of the second box is: "+ vol);
        System.out.println("The weight of the second box is: " +b2.weight);
        System.out.println("The volume of the third  box is:"+ b3.volume());
        System.out.println("The volume of the fourth box is:" +b4.volume());
        System.out.println("The volume of the fifth box is:" +b5.volume());
    }
}
class refeDemo{
    public static void main(String[] args) {
        Boxweight weightbox=new Boxweight(3,5,8.37 ,9);
        Box plainbox=new Box();
        double vol;
        vol=weightbox.volume();
        System.out.println("Volume of weightbox is " + vol );
        System.out.println(" Weight of weightbox is:" +weightbox.weight);
        plainbox=weightbox;
        vol=plainbox.volume();
        System.out.println("Volume of plainbox is: " +vol);
        /*System.out.println("Weight of plainbox is: " + plainbox.weight); gives errror as this cannot access weight it is not in its scope*/
    }
}