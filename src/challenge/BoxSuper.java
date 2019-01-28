package challenge;

public class BoxSuper {
     private double length;
     private double width;
     private  double height;

    BoxSuper()
    {
     length=-1;
     width=-1;
     height=-1;
    }
    BoxSuper(double w,double h,double l)
    {
        width=w;
        length=l;
        height=h;
    }
    BoxSuper(double len)
    {
        length=width=height=len;
    }
    BoxSuper(BoxSuper ob)
    {
        width=ob.width;
        length=ob.length;
        height=ob.height;
    }
    double volume()
    {
        return length*width*height;
    }
}
class BoxWeightSuper extends BoxSuper
{
    double weight;
    BoxWeightSuper(double w,double h,double l,double we)
    {
        super(w,h,l);
        weight=we;
    }
    BoxWeightSuper(double len,double we)
    {
        super(len);
        weight=we;
    }
    BoxWeightSuper (BoxWeightSuper ob)
    {
        super(ob);
        weight=ob.weight;
    }
    BoxWeightSuper()
    {
        super();
        weight=-1;
    }
}
class BoxSuperAccess
{
    public static void main(String[] args) {
        BoxWeightSuper mybox1=new BoxWeightSuper(4,6,8,9);
        BoxWeightSuper mybox2=new BoxWeightSuper(4,9);
        BoxWeightSuper  mybox3=new BoxWeightSuper();
        BoxWeightSuper  mybox4=new BoxWeightSuper(mybox1);
        double vol;
        vol=mybox1.volume();
        System.out.println("The volume of the first box is :"+ vol);
        System.out.println("The weight of the first box is:" + mybox1.weight);
        vol=mybox2.volume();
        System.out.println("The volume of the second box is:"+ vol);
        System.out.println("The weight of the first box is:" +mybox2.weight);
        vol=mybox3.volume();
        System.out.println("The volume of the third box is :"+vol);
        System.out.println("The weight of the third box is:"+ mybox3.weight);
        System.out.println("The volume of the fourth box is:" +mybox4.volume());
        System.out.println("The weight of the fourth box is:" +mybox4.weight);

    }
}