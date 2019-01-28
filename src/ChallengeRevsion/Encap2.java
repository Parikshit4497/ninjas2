package ChallengeRevsion;

import challenge.Printer;

public class Encap2 {
    private int tonerLevel;
    private int pagerPrinted;
    private boolean duplex;
    public Encap2(int tonerLevel,boolean duplex)
    {
        if(tonerLevel>-1&&tonerLevel<=100)
        {
            this.tonerLevel=tonerLevel;
        }
        else
        {
            this.tonerLevel=-1;
        }
        this.duplex=duplex;
        this.pagerPrinted=0;

    }
    public  int addToner(int tonerAmount)
    {
          if (tonerAmount>0&&tonerAmount<=100)
          {
                if(this.tonerLevel+tonerLevel>100)
                {
                    return -1;
                }
                this.tonerLevel+=tonerLevel;
                return this.tonerLevel;
          }
          else
          {
              return -1;
          }
    }
    public int printPages(int pages )
    {
        int printAges;
        if(this.duplex)
        {
            pagerPrinted/=2;
            System.out.println("printing in duplex mode:");
        }
           return  pagerPrinted;
    }
}
class printMain {
    public static void main(String args[]) {
        Encap2 printer=new Encap2(50,true);
        System.out.println("Initial page count:" + printer.printPages(4));

    }
}