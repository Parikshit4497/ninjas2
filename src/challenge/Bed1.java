package challenge;

public class Bed1 {
    private String style;
    private int pillow;
    private int height;
    private int quilt;
    private int sheets;
    Bed1(String style,int pillow,int height,int quilt,int sheets)
    {
        this.style=style;
        this.quilt=quilt;
        this.pillow=pillow;
        this.sheets=sheets;
        this.height=height;
    }
   public  void make()
   {
       System.out.println("The bed is made");
   }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPillow() {
        return pillow;
    }

    public void setPillow(int pillow) {
        this.pillow = pillow;
    }

    public int getQuilt() {
        return quilt;
    }

    public void setQuilt(int quilt) {
        this.quilt = quilt;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
