package challenge;

public class Resolution {
    private int width;
    private int length;
    Resolution(int length,int width)
    {
        this.width=width;
        this.length=length;
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
