package challenge;

public class Car1 extends  Vehicle{

    private String engine_type;
    private  double length;
    private  double height;
    private  double boot_space;
    private int no_gears;
    private int wheel;
    private int doors;
    private int currentGear;
    private  boolean isManual;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    Car1(String name,String engine, int min_speed, int max_speed, double price, String engine_type, double length, double height, double boot_space, int no_gears, int wheel, boolean isManual, int doors)
    {
        super(name,engine,min_speed,max_speed,price);
        this.boot_space=boot_space;
        this.length=length;
        this.height=height;
        this.engine_type=engine_type;
        this.no_gears=no_gears;
        this.wheel=wheel;

        this.isManual=isManual;
        this.doors=doors;
        this.currentGear=1;
    }
    public int getNo_gears() {
        return no_gears;
    }

    public void setNo_gears(int no_gears) {
        this.no_gears = no_gears;
    }
    public int getWheel() {
        return wheel;
    }
    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
    public double getBoot_space() {
        return boot_space;
    }

    public void setBoot_space(double boot_space) {
        this.boot_space = boot_space;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {

        return currentGear;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car .setCurrentGear() changed :" + this.currentGear+" gear.");
    }
    public void changeVelocity(int speed,int direction)
    {
        move(speed,direction);
        System.out.println("Car.Change.Velocity():" +speed+"direction"+direction);
    }
}
