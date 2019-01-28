package challenge;

public class Monitor {
    private String model;
    private String Manufacturer;
    private int size;
    private Resolution nativeResolution;
    Monitor(String model,String Manufacturer,int size,Resolution nativeResolution)
    {
        this.Manufacturer=Manufacturer;
        this.model=model;
        this.nativeResolution=nativeResolution;
        this.size=size;
    }
    public void drawPixelAt(int x,int y,String color)
    {
        System.out.println("Drawing pixel at :"+ x +","+y+" in color " + color);
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void setNativeResolution(Resolution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
