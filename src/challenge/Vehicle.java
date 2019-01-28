package challenge;

public class Vehicle {

    private String engine;
    private int min_speed;
    private int max_speed;
    private double price;
    private int currentDirection;
    private  int currentVelocity;
    String name;
    public  Vehicle(String name,String engine,int min_speed,int max_speed,double price)
    {
        this.engine=engine;
        this.max_speed=max_speed;
        this.min_speed=min_speed;
        this.price=price;
        this.currentDirection=0;
        this.currentVelocity=0;
        this.name=name;
    }
     public void steer(int direction)
     {
         this.currentDirection+=direction;
         System.out.println("Vehicle.steer() at:" +currentDirection+" degree.");
     }
     public  void move(int velocity ,int direction)
     {
         currentDirection=direction;
         currentVelocity=velocity;
         System.out.println("Vehicle.move() moving at:"+ currentVelocity+"in direction:" + currentDirection);
     }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getMin_speed() {
        return min_speed;
    }

    public void setMin_speed(int min_speed) {
        this.min_speed = min_speed;
    }
    public void stop(int currentVelocity)
    {
        this.currentVelocity=currentVelocity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
