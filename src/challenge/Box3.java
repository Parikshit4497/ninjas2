package challenge;

public class Box3 {
    private double width;
    private  double height;
    private  double length;
    Box3()
    {
        length=-1;
        width=-1;
        height=-1;
    }
    Box3(double w,double l,double h)
    {
        length=l;
        width=w;
        height=h;
    }
    Box3(double len)
    {
        width=height=length=len;
    }
    Box3(Box3 ob)
    {
        length=ob.length;
        width=ob.width;
        height=ob.width;
    }
    double volume()
    {
        return length*height*width;
    }
}
class Box3Weight extends Box3
{
    double weight;
    Box3Weight()
    {
        super();
        weight=-1;
    }
    Box3Weight(double len)
    {
            super(len);
            weight=len;
    }
    Box3Weight(double we,double l,double w,double h)
    {
        super(l,w,h);
        weight=we;
    }
    Box3Weight(Box3Weight ob)
    {
        super(ob);
        weight=ob.weight;
    }
}
class Shipment extends Box3Weight
{
    double cost;
    Shipment()
    {
        super();
        cost=-1;
    }
    Shipment(double l,double w,double h,double we,double c)
    {
        super(we,l,w,h);
        cost=c;
    }
    Shipment(double len,double c)
    {
        super(len);
        cost=c;
    }
    Shipment(Shipment sh)
    {
        super(sh);
        cost=sh.cost;
    }

}
class DemoShipment
{
    public static void main(String[] args) {
        Shipment shipment1=new Shipment(10,20,15,10,3.41);
        Shipment shipment2=new Shipment(4,5);
        Shipment shipment3=new Shipment();
        Shipment shipment4=new Shipment(shipment3);
        System.out.println("The volume of the first shipment is :" + shipment1.volume());
        System.out.println("The weight of the the first shipment is:"+ shipment1.weight);
        System.out.println("The cost of the first box is:" +shipment1.cost);
        System.out.println("The volume of the second shipment is:" + shipment2.volume());
        System.out.println("The weight of the first box is:"+shipment2.weight);
        System.out.println("The cost of the third box is:" + shipment2.cost);
        System.out.println("The volume of the second shipment is:" + shipment3.volume());
        System.out.println("The weight of the first box is:"+shipment3.weight);
        System.out.println("The cost of the third box is:" + shipment3.cost);
        System.out.println("The volume of the second shipment is:" + shipment4.volume());
        System.out.println("The weight of the first box is:" + shipment4.weight);
        System.out.println("The cost of the third box is:"   +  shipment4.cost);

    }
}