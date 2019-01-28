package challenge;



public class Vehicle2 {
    private int  noOfwheels;
    private int  noOfgears;
    private double length;
    private double width;
    private double height;
    private String fueltype;
    private String enginetype;
    Vehicle2(int noOfgears, int noOfwheels, double length, double width, double height, String fueltype, String enginetype) {
            this.enginetype=enginetype;
           this.fueltype=fueltype;
           this.height=height;
           this.noOfgears=noOfgears;
           this.width=width;
           this.noOfwheels=noOfwheels;
           this.length=length;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public String getFueltype() {
        return fueltype;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public int getNoOfgears() {
        return noOfgears;
    }

    public int getNoOfwheels() {
        return noOfwheels;
    }

    public double getWidth() {
        return width;
    }
    public void changeDirect(String direction,String angle)
    {
        System.out.println("The vehicle has now turned "+direction+" by angle of" + angle);
    }
    public void changeGear(int gear)
    {
        System.out.println("The car is now in " + gear+" gear");
    }
    public void Applybreak()
    {
        System.out.println("The break has been applied");
    }
}
class car2 extends Vehicle2
{
     private String carBrand;
     private  String carType;
     private String Transmission;
     private double bootspace;
     private  int noOfdoors;
     car2(String carBrand, String carType, String Transmission, double bootspace, int noOfdoors, int noOfwheels, double length, double height, double width, String fueltype,String enginetype,int noOfgears)
    {
        super( noOfgears, noOfwheels, length, width, height,fueltype, enginetype);
        this.bootspace=bootspace;
        this.carBrand=carBrand;
        this.noOfdoors=noOfdoors;
        this.carType=carType;
        this.Transmission=Transmission;
    }

    public double getBootspace() {
        return bootspace;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarType() {
        return carType;
    }

    public int getNoOfdoors() {
        return noOfdoors;
    }

    public String getTransmission() {
        return Transmission;
    }
 }
class Audi extends car2
{
    private double topSpeed;
    private String colour ;
    private double price;
    private String modelType;
    private double acceleration;
    Audi(String carBrand, String carType, String Transmission, double bootspace, int noOfdoors, int noOfwheels, double length, double height, double width, String fueltype,String enginetype,int noOfgears,double topSpeed, String colour, double price,String modelType ,double acceleration)
    {
           super(carBrand,  carType, Transmission, bootspace, noOfdoors, noOfwheels, length, height, width, fueltype, enginetype, noOfgears);
           this.topSpeed=topSpeed;
           this.acceleration=acceleration;
           this.modelType=modelType;
           this.price=price;
           this.colour=colour;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public String getColour() {
        return colour;
    }

    public String getModelType() {
        return modelType;
    }

    public double getPrice() {
        return price;
    }

    public double getTopSpeed() {
        return topSpeed;
    }
}
class CarTest
{
    public static void main(String[] args) {
        Audi a1=new Audi("Audi","Suv","4 wheel ",860,2,4,1.567,1.6778,1234,"diesel","V12",6,289,"red",56789, "Q7",7);
        a1.changeDirect("right","30");
        a1.changeGear(4);
        a1.Applybreak();
        System.out.println(a1.getAcceleration());
        System.out.println(a1.getCarBrand());


    }
}