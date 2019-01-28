package challenge;

public class BillsBurger2 {
    private  String name;
    private  String getMeat;
    private  double price;
    private String breadRollType;

    private  String addittion1Name;
    private  double addition1Price;

    private  String addittion2Name;
    private  double addition2Price;

    private  String addittion3Name;
    private  double addition3Price;

    private  String addittion4Name;
    private  double addition4Price;
    public  BillsBurger2(String name,String getMeat,double price ,String breadRollType)
    {
        this.name=name;
        this.breadRollType=breadRollType;
        this.price=price;
        this.getMeat=getMeat;

    }

      public void addHamBurgerAddittion1(String name,double price)
      {
          this.addittion1Name=name;
          this.addition1Price=price;
      }
    public void addHamBurgerAddittion2(String name,double price)
    {
        this.addittion2Name=name;
        this.addition2Price=price;
    }

    public void addHamBurgerAddittion3(String name,double price)
    {
        this.addittion3Name=name;
        this.addition3Price=price;
    }

    public void addHamBurgerAddittion4(String name,double price)
    {
        this.addittion4Name=name;
        this.addition4Price=price;
    }
    public double itemizeHamburger()
    {
        double hamBurgerPrice=this.price;
        System.out.println(this.name+"hamburger" +  "On a" + this.breadRollType+"roll " +" price is" +this.price);
        if(this.addittion1Name!=null)
        {
            hamBurgerPrice=hamBurgerPrice+this.addition1Price;
            System.out.println("Added"+ this.addittion1Name+" for an extra"+this.addition1Price);
        }
         if(this.addittion2Name!=null)
        {
            hamBurgerPrice=hamBurgerPrice+this.addition2Price;
            System.out.println("Added "+ this.addittion2Name+" for an extra"+this.addition2Price);
        }
          if(this.addittion3Name!=null)
        {
            hamBurgerPrice=hamBurgerPrice+this.addition3Price;
            System.out.println("Added "+ this.addittion3Name+" for an extra"+this.addition3Price);
        }
        if(this.addittion4Name!=null)
        {
            hamBurgerPrice=hamBurgerPrice+this.addition4Price;
            System.out.println("Added"+ this.addittion4Name+" for an extra"+this.addition4Price);
        }
        return  hamBurgerPrice;
    }
}
class HealthyBurger extends BillsBurger2
{
    private  String healtyExtra1Name;
    private double healthyExtra1Price;
    private String healtyExtra2Name;
    private  double healtyExtra2Price;
    public  HealthyBurger (String meat ,double price)
    {
        super("Healthy ",meat,price,"Brown rye");
    }
    public void addHealthAddittion1(String name,double price)
    {
        this.healtyExtra1Name=name;
        this.healthyExtra1Price=price;
    }
    public  void addHealthAddittion2(String name,double price)
    {
        this.healtyExtra2Name=name;
        this.healtyExtra2Price=price;
    }
    public  double itemizeHamburger()
    {
        double hamburgerPrice=super.itemizeHamburger();
        if(this.healtyExtra1Name!=null)
        {
            hamburgerPrice+=this.healthyExtra1Price;
            System.out.println("Added " + this.healtyExtra1Name +" for an extra" + this.healthyExtra1Price);
        }
        if(this.healtyExtra2Name!=null)
        {
            hamburgerPrice+=this.healtyExtra2Price;
            System.out.println("Added " + this.healtyExtra2Name +" for an extra" + this.healtyExtra2Price);
        }
        return  hamburgerPrice;
    }
}
class DeluxeBurger extends BillsBurger2
{
    public DeluxeBurger()
    {
        super("Deluxe","Sausage & bacon",14.54,"White");
        super.addHamBurgerAddittion1("chips",2.75);
        super.addHamBurgerAddittion2("Drink",1.81);
    }
    public void addHamBurgerAddittion1(String name,double price)
    {
        System.out.println("Cannot not additional items to a deluxe burger ");
    }
    public void addHamBurgerAddittion2(String name,double price)
    {
        System.out.println("Cannot not additional items to a deluxe burger ");
    }
    public void addHamBurgerAddittion3(String name,double price)
    {
        System.out.println("Cannot not additional items to a deluxe burger ");
    }
    public void addHamBurgerAddittion4(String name,double price)
    {
        System.out.println("Cannot not additional items to a deluxe burger ");
    }


}
class HamBurger
{
    public static void main(String[] args) {
        BillsBurger2 b1=new BillsBurger2("Basic","Sausage",3.56,"White");
        double price=b1.itemizeHamburger();
        b1.addHamBurgerAddittion1("Tomato",0.27);
        b1.addHamBurgerAddittion2("Lettuce",0.75);
        b1.addHamBurgerAddittion3("Cheese",1.12);
        System.out.println("Total Burger price is:" + b1.itemizeHamburger());
        HealthyBurger healthBurger=new HealthyBurger("Bacon",5.67);
        healthBurger.addHealthAddittion1("Egg",5.43);
        healthBurger.addHealthAddittion2("Lentils",3.41);
        System.out.println("Total Healthy Burger price is:"+ healthBurger.itemizeHamburger());
        DeluxeBurger db=new DeluxeBurger();
       db.addHamBurgerAddittion3("should  not do this ",50.34);
       db.itemizeHamburger();

    }
}