package challenge;

public class DimensionOfBed {
    private int bedlength;
    private int bedwidth ;
    private int bedheight;
    DimensionOfBed(int bedlength,int bedwidth,int bedheight)
    {
        this.bedwidth=bedwidth;
        this.bedheight=bedheight;
        this.bedlength=bedlength;
    }
    public int getBedlength() {
        return bedlength;
    }

    public void setBedlength(int bedlength) {
        this.bedlength = bedlength;
    }

    public int getBedheight() {
        return bedheight;
    }

    public void setBedheight(int bedheight) {
        this.bedheight = bedheight;
    }

    public int getBedwidth() {
        return bedwidth;
    }

    public void setBedwidth(int bedwidth) {
        this.bedwidth = bedwidth;
    }
}
