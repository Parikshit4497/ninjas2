package challenge;

public class Printer {
    private int noOfpages;
    private boolean isDuplex;
    private  Toner toner;
    Printer(int noOfpages,boolean isDuplex,Toner toner)
    {
        this.isDuplex=isDuplex;
        this.noOfpages=noOfpages;
        this.toner=toner;
    }

    public void NumberOfpagesprinted(int pages)
    {
        if(pages>this.noOfpages)
        {
            System.out.println("The ink level are not sufficient to print these no of pages: " );
        }
        else
        {
            System.out.println("The no of pages to be printed are :" +pages );
        }
    }
    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public int getNoOfpages() {
        return noOfpages;
    }

    public void setNoOfpages(int noOfpages) {
        this.noOfpages = noOfpages;
    }

    public Toner getToner() {
        return toner;
    }

    public void setToner(Toner toner) {
        this.toner = toner;
    }
}
