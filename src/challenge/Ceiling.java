package challenge;

public class Ceiling {
    private int height;
    private String colour;
    Ceiling(int height,String colour )
    {
        this.colour=colour;
        this.height=height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
