package ChallengeRevsion;

public class Dimensions11 {
    private int width;
    private  int height;
    private  int depth;
    public Dimensions11(int width,int height,int depth)
    {
        this.width=width;
        this.depth=depth;
        this.height=height;
    }
           public void pressPowerButton()
           {
               System.out.println("Power button pressed:");
           }
    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
