package OopsPackage;

public class ObjectsAsParameters {
    int a ,b;
    ObjectsAsParameters(int i,int j)
    {
        a=i;
        b=j;
    }
    boolean equalTo(ObjectsAsParameters o)
    {

        if(o.a==a&&o.b==b)
            return true;
        else
            return false;
    }
}
class ObjectPar
{
    public static void main(String[] args) {
        ObjectsAsParameters o1=new ObjectsAsParameters(100,22);
        ObjectsAsParameters o2=new ObjectsAsParameters(100,22);
        ObjectsAsParameters o3=new ObjectsAsParameters(22,33);
        System.out.println("OB1==OB2 "  +o1.equalTo(o2));
        System.out.println("OB2==Ob3 "+ o2.equalTo(o3));
    }
}
