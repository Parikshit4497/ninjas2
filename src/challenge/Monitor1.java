package challenge;

public class Monitor1 {
    String Model;
    String Manufactureres;
    int size;
    Resolution1 nativeResolution;
    Monitor1(String Model,String Manufactureres,int size,Resolution1 nativeResolution)
    {
        this.Manufactureres=Manufactureres;
        this.Model=Model;
        this.size=size;
        this.nativeResolution=nativeResolution;
    }
    public void drawPixelAt(int x,int y,String color)
    {
        System.out.println("Drawing pixel at :"+ x +","+y+" in color " + color);
    }
    public String getManufactureres() {
        return Manufactureres;
    }

    public void setManufactureres(String manufactureres) {
        Manufactureres = manufactureres;
    }

    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public Resolution1 getNativeResolution() {
        return nativeResolution;
    }
    public void setNativeResolution(Resolution1 nativeResolution) {
        this.nativeResolution = nativeResolution;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
