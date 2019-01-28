package OopsPackage;

public class BoxObjAsArg {
    double width ;
    double height;
    double length;

    BoxObjAsArg()
    {
        width=-1;
        height=-1;
        length=-1;
    }
    BoxObjAsArg(double height,double length,double width)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    BoxObjAsArg(double len)
    {
        length=height=width=len;
    }
    BoxObjAsArg(BoxObjAsArg o)
    {
        width=o.width;
        length=o.length;
        height=o.height;
    }
    double Volume()
    {
        return width*length*height;
    }
}
class OverloadCons1
{
    public static void main(String[] args) {
        BoxObjAsArg B1=new BoxObjAsArg();
        BoxObjAsArg B2=new BoxObjAsArg(4,5,7);
        BoxObjAsArg B3=new BoxObjAsArg(8);
        BoxObjAsArg B4=new BoxObjAsArg(B3);
        System.out.println( B1.Volume());
        System.out.println( B2.Volume());
        System.out.println(B3.Volume());
        System.out.println(B4.Volume());
    }
}