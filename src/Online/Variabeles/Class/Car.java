package Online.Variabeles.Class;

public class Car {
    private int doors;
    private int wheels ;
    private String model ;

    private String engine;

    private String color;

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel=model.toLowerCase();
        if(validModel.equals("carrera") ||validModel.equals("commadore")) {
            this.model = model;
        }else{
            this.model="Unknown";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
