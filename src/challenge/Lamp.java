package challenge;

public class Lamp {
    private  String style;
    private  boolean battery;
    private int globRatings;
    Lamp(String style,boolean battery,int globRatings)
    {
        this.battery=battery;
        this.globRatings=globRatings;
        this.style=style;
    }
    public void turnOn()
    {
        System.out.println("Lamp turning On:");
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobRatings() {
        return globRatings;
    }

    public void setGlobRatings(int globRatings) {
        this.globRatings = globRatings;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
