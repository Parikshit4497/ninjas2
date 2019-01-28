package Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPlayer {
    public static void main(String[] args) {
     Player tim=new Player("Tim",10,15);
        System.out.println(tim.toString());
        saveObjects(tim);
        tim.setHitPoints(8);
        tim.setWeapon("Stormbringer");
        saveObjects(tim);
        loadObjects(tim);
        System.out.println(tim);
            ISavable werewolf=new Monster("WereWolf",20,40);
        System.out.println(werewolf.toString());
            System.out.println(((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObjects(werewolf);
        loadObjects(werewolf);

    }
    public static ArrayList<String > readValues()
    {
        ArrayList<String > values=new ArrayList <>();
        Scanner scanner =new Scanner(System.in);
        boolean quit=false;
        int index=0;
        System.out.println("Choose\n"+"1 to enter a string \n" + "0 to quit ");
        while(!quit)
        {
            System.out.println("Choose an option :");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter a string :");
                    String stringInput=scanner.nextLine();
                    values.add(index,stringInput);
                    index++;

            }
        }
        return  values;

    }
    public  static  void saveObjects(ISavable objectToSave)
    {
        for(int i=0;i<objectToSave.write().size();i++)
        {
            System.out.println("Saving " + objectToSave.write().get(i) +" to storage device");

        }
    }
    public  static void loadObjects (ISavable objectToLoad)
    {
        ArrayList<String > values=readValues();
        objectToLoad.read(values);
    }

}
class Monster implements ISavable
{
    private  String name;
    private  int hitPoints;
    private  int strength;
    public Monster(String name,int hitpoints,int strength)
    {
        this.name=name;
        this.hitPoints=hitpoints;
        this.strength=strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String > values=new ArrayList <>();
        values.add(0,this.name);
        values.add(1,"" +this.hitPoints);
        values.add(2,"" +this.strength);
        return values;
    }

    @Override
    public void read(List <String> savedValues) {
           if(savedValues!=null&&savedValues.size()>0)
           {
               this.name=savedValues.get(0);
               this.hitPoints=Integer.parseInt(savedValues.get(1));
               this.strength=Integer.parseInt(savedValues.get(2));

           }

    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
