package challenge;

public class CareRe {
    private int doors;
    private int wheels;
    private  String model;
    private String engine ;
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel= model.toLowerCase();
        if(validModel.equals("carerra")||validModel.equals("holden"))
        {
            this.model=model;
        }
        else {
            this.model="unknown";
        }
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
