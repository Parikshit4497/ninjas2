package challenge;

import java.lang.Override;

class CarPoly
{
    private boolean engine;
    private  String name;
    private  int noOfCylinders;
    private  int noOfwheels;
    private  double bootSpace;
    CarPoly(boolean engine,String name,int noOfwheels,int noOfCylinders,double bootSpace)
    {
        this.bootSpace=bootSpace;
        this.engine=engine;
        this.name=name;
        this.noOfCylinders=noOfCylinders;
        this.noOfwheels=noOfwheels;
    }

    public double getBootSpace() {
        return bootSpace;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public int getNoOfwheels() {
        return noOfwheels;
    }
    public  String startEngine()
    {
        return  "Car-Engine";
    }
    public String accelerate()
    {
        return "Car accelerate ()";
    }
    public  String brake()
    {
        return "Car -brake";
    }
}
class Mercedes extends  CarPoly{

Mercedes(boolean engine, String name, int noOfwheels, int noOfCylinders, double bootSpace) {
    super(engine, name, noOfwheels, noOfCylinders, bootSpace);
}

    @Override
    public String accelerate() {
        return "Mitsubushi -> accelerate:";
    }

    @Override
    public String brake() {
        return  "Mitsubushi-> brake:";
    }

    @Override
    public String startEngine() {
        return "Mitsubushi -> brake:";
    }
}
class Mitsubshi extends CarPoly {

    Mitsubshi(boolean engine,String name,int noOfwheels,int noOfCylinders,double bootSpace) {
        super(engine, name, noOfwheels, noOfCylinders, bootSpace);
    }

    @Override
    public String accelerate() {
        return getClass().getName()+" -> accelerate:";
    }

    @Override
    public String brake() {
        return  "Mitsubushi-> brake:";
    }

    @Override
    public String startEngine() {
        return "Mitsubushi -> brake:";
    }
}


public class Polymorphism {
    public static void main(String[] args) {
          CarPoly car=new CarPoly(true,"audi",4,12,1000);
        System.out.println(car.startEngine());
        System.out.println(  car.accelerate());
        System.out.println( car.brake());
        Mercedes mercedes =new Mercedes(true,"6666",4,12,5000);
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());
        System.out.println(mercedes.startEngine());
        Porche porche=new Porche(true,"lameraata",4,12,5000);
        System.out.println(porche.accelerate());
        System.out.println(porche.brake());
        System.out.println(porche.startEngine());
        Mitsubshi m1=new Mitsubshi(true,"lancer",4,12,5000);
        System.out.println(m1.accelerate());
        System.out.println(m1.brake());
        System.out.println(m1.startEngine());
    }


}
