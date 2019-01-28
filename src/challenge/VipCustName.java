package challenge;

public class VipCustName {
   private String name;
   private double creditlimit;
   private  String emailAdrress;
   public  VipCustName(String name,double creditlimit)
   {
       this(name,creditlimit,"unknown@email.com");
   }
   public VipCustName()
   {
       this("DefaultName",500000.00,"default@gmail.com");
   }
   public VipCustName(String name,double creditlimit,String emailAdrress)
   {
       this.name=name;
       this.creditlimit=creditlimit;
       this.emailAdrress=emailAdrress;
   }
   public String getName()
   {
       return name;
   }
   public double creditLimit()
   {
       return creditlimit;
   }
   public String getEmailAdrress()
   {
       return emailAdrress;
   }

}
