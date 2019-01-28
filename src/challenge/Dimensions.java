package challenge;

public class Dimensions {
    private  int height;
    private  int depth;
    private int width;

    Dimensions(int height,int depth,int width)
    {
        this.depth=depth;
        this.height=height;
        this.width=width;
    }
    public void pressPowerButton()
    {
        System.out.println("Power button pressed: ");
    }
    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
