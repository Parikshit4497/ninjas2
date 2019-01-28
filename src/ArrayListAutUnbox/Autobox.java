package ArrayListAutUnbox;

import java.util.ArrayList;
class IntClass
{
    private int myValue;
    public  IntClass(int myValue)
    {
        this.myValue=myValue;
    }
    public int getMyValue()
    {
        return myValue;
    }
    public  void setMyValue(int myValue)
    {
        this.myValue=myValue;
    }
}
public class Autobox {
    public static void main(String[] args) {
        String stArray[]=new String[10];
        int intArray[]=new int[10];
        ArrayList<String > stringArrayList=new ArrayList <String >();
        stringArrayList.add("Tim");
      /*  ArrayList<int> intArrayList=new ArrayList <int>();*/
        ArrayList<IntClass> intClassArrayList=new ArrayList <>();
        intClassArrayList.add(new IntClass(54));
        Integer integer=new Integer(54);
        Double doubleValue=new Double(12.24);
        ArrayList<Integer> integerArrayList =new ArrayList <>();
        for (int i=0;i<=10;i++)
        {
            integerArrayList.add(Integer.valueOf(i));
        }
        for (int i=0;i<=10;i++)
        {
            System.out.println(i+"--->" +integerArrayList.get(i).intValue());
        }
        /*shorter way of carrying out the above process:*/
        Integer myIntvalue=56;/*This line would get implemented normally because at compile time
        it gets executed as follows Integer.valueOf(56)*/
        int myInt=myIntvalue.intValue();
        ArrayList<Double> myDoubleValues=new ArrayList <Double>();
        for(double dbl=0.0;dbl<=10.0;dbl+=0.5)
        {
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for(int i=0;i<myDoubleValues.size();i++)
        {
            double value=myDoubleValues.get(i).doubleValue();/*you can do it with myDoubleValues.get(i) as well*/
            System.out.println(i+"-->"+value);
        }
    }
}
