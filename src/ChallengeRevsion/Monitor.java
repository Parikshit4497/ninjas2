package ChallengeRevsion;

import challenge.Resolution;

public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resolution2 nativeResolution;

    public Monitor(String model,String manufacture,int size,Resolution2 nativeResolution)
    {
        this.model=model;
        this.manufacture=manufacture;
        this.size=size;
        this.nativeResolution=nativeResolution;
    }
    public void drawPixelAt(int x,int y,String color)
    {
        System.out.println("Drawing pixel at " + x+ "," + y+"in colour " +color);
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public Resolution2 getNativeResolution() {
        return nativeResolution;
    }

    public int getSize() {
        return size;
    }
}
