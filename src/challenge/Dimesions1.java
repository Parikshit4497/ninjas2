package challenge;

public class Dimesions1 {
    private int width;
    private  int length;
    private int height;
    Dimesions1(int width,int length,int height)
    {
        this.height=height;
        this.length=length;
        this.width=width;
    }
    public void powerButton()
    {
        System.out.println("The power button is pressed");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
