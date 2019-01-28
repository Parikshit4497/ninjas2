package challenge;

import java.util.Scanner;

public class BillsBurger {

    private RollType  rolltype;
    private  MeatType   meatType;
    private   double base_price;
    private  double net_cost;

    BillsBurger()
    {

    }
    BillsBurger(RollType rolltype,MeatType meatType,double base_price,double net_cost) {
        this.base_price = base_price;
        this.meatType = meatType;
        this.rolltype = rolltype;
        this.net_cost = net_cost;
    }

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    public double getNet_cost() {
        return net_cost;
    }

    public void setNet_cost(double net_cost) {
        this.net_cost = net_cost;
    }

    public RollType getRolltype() {
        return rolltype;
    }

    public void setRolltype(RollType rolltype) {
        this.rolltype = rolltype;
    }
}
class RollType
{
    private double roll_length;
    private String  roll_name;
    private  String roll_state;
    private  double roll_price;

    RollType(double roll_length,String roll_name,String roll_state,double roll_price)
    {
        this.roll_length=roll_length;
        this.roll_name=roll_name;
        this.roll_state=roll_state;
        this.roll_price=roll_price;
    }

    public double getRoll_length() {
        return roll_length;
    }

    public void setRoll_length(double roll_length) {
        this.roll_length = roll_length;
    }

    public String getRoll_state() {
        return roll_state;
    }

    public void setRoll_state(String roll_state) {
        this.roll_state = roll_state;
    }

    public String getRoll_name() {
        return roll_name;
    }

    public void setRoll_name(String roll_name) {
        this.roll_name = roll_name;
    }

    public double getRoll_price() {
        return roll_price;
    }

    public void setRoll_price(double roll_price) {
        this.roll_price = roll_price;
    }


}
class MeatType
{
    private String meatType;
    private double length;
    private  double meatWeightPerCM;
    private  double meatPricePerGram;

    MeatType(String meatType ,double length, double meatPricePerGram,double meatWeightPerCM) {
          this.length=length;
          this.meatPricePerGram=meatPricePerGram;
          this.meatWeightPerCM=meatWeightPerCM;
          this.meatType=meatType;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getMeatPricePerGram() {
        return meatPricePerGram;
    }

    public void setMeatPricePerGram(double meatPricePerGram) {
        this.meatPricePerGram = meatPricePerGram;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public double getMeatWeightPerCM() {
        return meatWeightPerCM;
    }

    public void setMeatWeightPerCM(double meatWeightPerCM) {
        this.meatWeightPerCM = meatWeightPerCM;
    }
    public double netCost()
    {
        return this.length*this.meatPricePerGram*this.meatWeightPerCM;
    }
}
class Mayaonisse
{
         private double Mayoprice ;
         private String   MayoFlav;
         private boolean ExtramaYo;

         Mayaonisse (double Maypprice,String  MayoFlav, boolean ExtraMayo)
         {
             this.MayoFlav=MayoFlav;
             this.ExtramaYo=ExtraMayo;
             this.Mayoprice=Maypprice;
         }

    public boolean isExtramaYo() {
        return ExtramaYo;
    }

    public void setExtramaYo(boolean extramaYo) {
        ExtramaYo = extramaYo;
    }

    public String  getMayoFlav() {
        return MayoFlav;
    }

    public void setMayoFlav(String  mayoFlav) {
        MayoFlav = mayoFlav;
    }

    public double getMayoprice() {
        return Mayoprice;
    }

    public void setMayoprice(double mayoprice) {
        Mayoprice = mayoprice;
    }

}
class KetchUp
{
         private  String ketchUpflavour;
         private  double cost;

         KetchUp(String ketchUpflavour,double cost)
         {
             this.cost=cost;
             this.ketchUpflavour=ketchUpflavour;
         }

    public double getCost() {
        return cost;
    }

    public double setCost(double cost) {
        this.cost = cost;
        return this.cost;
    }

    public String  getKetchUpflavour() {
        return ketchUpflavour;
    }

    public void setKetchUpflavour(String ketchUpflavour) {
        this.ketchUpflavour = ketchUpflavour;
    }

}
class Olives
{
    private  String OliveType;
    private  double  price;

    Olives(String OliveType,double price)
    {
        this.OliveType=OliveType;
        this.price=price;
    }
    public String getOliveType() {
        return OliveType;
    }

    public void setOliveType(String oliveType) {
        OliveType = oliveType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
class Cheese
{
    private String cheeseType;
    private  double cheeseCost;
    Cheese(double cheeseCost,String cheeseType)
    {
        this.cheeseCost=cheeseCost;
        this.cheeseType=cheeseType;
    }

    public double getCheeseCost() {
        return cheeseCost;
    }

    public void setCheeseCost(double cheeseCost) {
        this.cheeseCost = cheeseCost;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }
}
class BurgerCreate extends BillsBurger{
   private static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        BurgerCreate b1=new BurgerCreate();
        int n;
        double netPrice;
        double basePrice=50;
        int choice;

        while(1<2)
        {
            System.out.println("Enter the choice of burger you wish to eat :");
            System.out.println("1: Basic burger:");
            System.out.println("2: Premium burger:");
            System.out.println("3: Bill's Special: ");
            System.out.println("4: Extra large:");
             n=s.nextInt();
            switch(n)
            {
                case 1:
                    RollType rollBasic=new RollType(20,"Wheat Crust","Soft",30);
                    MeatType meatType=new MeatType("freshMeat",20,0.5,0.06);
                    netPrice=meatType.netCost()+rollBasic.getRoll_price()+basePrice;
                    BillsBurger base=new BillsBurger(rollBasic,meatType,basePrice,netPrice);
                    while(1<2)
                    {
                        System.out.println("Enter the option that you wish to choose:");
                        System.out.println("1: Add cheese ");
                        System.out.println("2: Add Mayonnaise:");
                        System.out.println("3: Add ketchup:");
                        System.out.println("4: Add olives:");
                        System.out.println("5 :Exit:");
                        choice=s.nextInt();
                        switch(choice)
                        {
                            case 1:
                               Cheese ch= Select_cheese();
                                netPrice+=ch.getCheeseCost();
                                System.out.println("The following cheeseType"+ ch.getCheeseType()+"with the cost:" + ch.getCheeseCost()+" has been selected");
                                break;
                            case 2:
                               Mayaonisse me= Select_mayonnaise();
                                netPrice+=me.getMayoprice();
                                System.out.println("The following Mayonnaise" + me.getMayoFlav()+"has been added and the net cost is:" + me.getMayoprice()+" has been selected");
                                break;
                            case 3:
                                KetchUp ke=Select_ketchup();
                                netPrice+=ke.getCost();
                                System.out.println("The following ketchup" + ke.getKetchUpflavour()+"has been chosen with the cost :" +ke.getCost()+" has been selected");
                                break;
                            case 4:
                                Olives ol=getOlives();
                                netPrice+=ol.getPrice();
                                System.out.println("The olives you have chosen are:" + ol.getOliveType()+"with the cost :" + ol.getPrice()+" has been selected");
                                break;
                            case 5:
                                System.exit(0);

                        }
                      b1.setNet_cost(netPrice);

                    }

            }
        }

    }
    public  static  Cheese Select_cheese()
    {
        String cheeseType="null";
        double cost=0;
        System.out.println("Enter the type of cheese");
        System.out.println("1:Cheddar");
        System.out.println("2: Brie");
        System.out.println("3: Goat cheese");
        System.out.println("4: None:");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
                cost =30;
                cheeseType="cheddar";
                break;
            case 2:
                cost=20;
                cheeseType="Brie";
                break;
            case 3:
                cost =15;

                cheeseType="Goat Cheese";
                break;
            case 4:
                System.exit(0);
        }
         return new Cheese(cost,cheeseType);
    }
    public static  Mayaonisse Select_mayonnaise()
    {
        String mayoflav="null";
        boolean ExtraMayo=false;
        double mayoCost=0;
        System.out.println("Enter the type of mayonnaise:");
        System.out.println("1: cashew mayonnaise:");
        System.out.println("2: egg less Mayonnaise:");
        System.out.println("3: Chilli Mayonnaise:");
        int choice=s.nextInt();
        switch (choice)
        {
            case 1:
                mayoflav="cashew mayonnaise:";
                mayoCost=40;
                System.out.println("Do you want extra mayo ");
                ExtraMayo=s.nextBoolean();
                break;
            case 2:
                mayoflav="egg less mayonnaise:";
                mayoCost=30;
                System.out.println("Do you want extra mayo ");
                ExtraMayo=s.nextBoolean();
                break;
            case 3:
                mayoflav="chilli mayonnaise:";
                mayoCost=50;
                System.out.println("Do you want extra mayo ");
                ExtraMayo=s.nextBoolean();
                break ;
            case 4:
                System.exit(0);

        }
      return new Mayaonisse(mayoCost,mayoflav,ExtraMayo);
    }
    public  static  KetchUp Select_ketchup()
    {
            String ketchupflav=null;
             double ketchup_cost=0;
        System.out.println("Enter the kind of ketchup you wish to choose");
        System.out.println("1:Tomato ketchup :");
        System.out.println("2: Tamarind ketchup:");
        System.out.println("3: Mint ketchup");
        int choice=s.nextInt();
        switch (choice)
        {
            case 1:
                ketchup_cost=15;
                ketchupflav="Tomato ketchup:";
                break ;
            case 2:
                ketchup_cost=20;
                ketchupflav="Tamarind ketchup:";
                break;
            case 3:
                ketchup_cost=25;
                ketchupflav="Mint ketchup:";
                        break;
            case 4:
                System.exit(0);
        }
     return  new KetchUp(ketchupflav,ketchup_cost);
    }
    public static  Olives getOlives()
    {
        String oliveType=null;
        double oliveCost=0;
        System.out.println("Enter the types of olives:");
        System.out.println("1: Green Olives:");
        System.out.println("2: Black Olives:");
        int choice =s.nextInt();
        switch(choice)
        {
            case 1:
                oliveType="Green Olives:";
                oliveCost=14;
                break;
            case 2:
                oliveCost=16;
                oliveType="Black Olives:";
                        break;

        }
        return  new Olives(oliveType,oliveCost);

    }
}