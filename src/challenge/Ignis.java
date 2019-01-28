package challenge;

public class Ignis extends Car1 {
    private  int roadservices;

    public Ignis(String name,String engine, int min_speed, int max_speed, double price, String engine_type, double length, double height, double boot_space, int no_gears, int wheel, boolean isManual, int doors, int roadservices) {
        super("ignis",engine, min_speed, max_speed, price, engine_type, length, height, boot_space, no_gears, wheel, isManual, doors);
        this.roadservices = roadservices;
    }
    public void accelerate(int rate )
    {
        int newVelocity=getCurrentGear()+rate;
        if(newVelocity==0)
        {
            stop(0);
            changeGear(1);
        }
        else if(newVelocity>0&&newVelocity<=10)
        {
            changeGear(1);

        }
        else if(newVelocity>10&&newVelocity<=20)
        {
            changeGear(2);
        }
        else if(newVelocity>20&&newVelocity<=30)
        {
            changeGear(3);
        }
        else {
          changeGear(4);
        }
    }
}
