package challenge;

public class Toner {
    private String colour4;
    private String colour1;
    private String colour2;
    private String colour3;
    private double colourlevel;
    private  double newColour;
    Toner(String colour4,String colour1,String colour2,String colour3,double colourlevel)
    {   this.colour1=colour1;
        this.colour2=colour2;
        this.colour3=colour3;
        this.colour4=colour4;
        if(colourlevel>=-1&&colourlevel<=100) {
        this.colourlevel=colourlevel;
    }
    else {
            this.colourlevel=-1;
        }
    }
    public void currentStatus()
    {
        System.out.println("The current colour level is: "+ this.colourlevel);
    }
    public void Addcolour(double colournew)
    {

        if(colournew+this.colourlevel>100)
        {
            System.out.println("The amount of colour you are adding is more than what is required: ");
        }
        else if(colournew+this.colourlevel<0)
        {
            System.out.println("The colour is to less:");
        }
        else {
        this.newColour=this.colourlevel+colournew;
            this.colourlevel=this.newColour;
            System.out.println("The new level of colour in the printer are " + this.colourlevel);
        }
    }


}
